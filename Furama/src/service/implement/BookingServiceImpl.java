package service.implement;

import common.CheckStartEndBooking;
import common.Random;
import model.Booking;
import model.facility.Facility;
import model.person.Customer;
import service.BookingService;
import service.MaintenanceService;
import ultility.ReadAndWrite;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.time.temporal.ChronoUnit.DAYS;

public class BookingServiceImpl implements BookingService {
    private static final String CUSTOMER_PATH_CSV = "src/data/CustomerCSV.csv";
    private static final String FACILITY_PATH_FILE = "src/data/FacilityCSV.csv";
    private static final String BOOKING_PATH_FILE = "src/data/BookingCSV.csv";
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        Set<Booking> bookingSet = ReadAndWrite.readBookingToCSV(BOOKING_PATH_FILE);
        if (bookingSet.isEmpty()){
            System.err.println("chưa có dữ liệu booking");
        }else {
            for (Booking b : bookingSet) {
                System.out.println(b);
            }
        }

    }

    @Override
    public void add() {

        Set<Booking> bookingSet = ReadAndWrite.readBookingToCSV(BOOKING_PATH_FILE);
        String bookingCode;
        boolean flag;
        do {
            bookingCode = Random.random();
            flag = false;
            for (Booking b : bookingSet) {
                if (b.getBookingCode().equalsIgnoreCase(bookingCode)) {
                    flag = true;
                    break;
                }
            }
        }while (flag) ;


            LocalDate startDay;
            LocalDate endDay;
            do {
                try {
                    System.out.println("nhập ngày bắt đầu");
                    startDay = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    if (CheckStartEndBooking.checkStartDay(startDay)) break;
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Nhập không đúng định dạng");
                }
            } while (true);


            do {
                try {
                    System.out.println("nhập ngày kết thúc");
                    endDay = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    if (CheckStartEndBooking.checkStartEndDay(startDay, endDay)) break;
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Nhập không đúng định dạng");
                }
            } while (true);

            System.out.println("chọn mã khách hàng");
            List<Customer> list = ReadAndWrite.readCustomerToCSV(CUSTOMER_PATH_CSV);
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }
            int i;
            while (true) {
                try {
                    i = Integer.parseInt(scanner.nextLine());
                  if (i< list.size()-1) {
                      break;
                  }
                } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("lựa chọn không đúng");
                }
            }
            Customer customer = list.get(i - 1);

            System.out.println("chọn tên dịch vụ");

            Map<Facility, Integer> facilityIntegerMap = ReadAndWrite.readFacilityToCSV(FACILITY_PATH_FILE);
            Set<Facility> facilitySet = facilityIntegerMap.keySet();
            List<Facility> stringList = new ArrayList<>();
            int j = 1;
            for (Facility f : facilitySet) {
                if (facilityIntegerMap.get(f) < 5) {
                    stringList.add(f);
                    System.out.println(j + ". " + f);
                    j++;
                }
            }

            int index;
            while (true) {
                try {
                    index = Integer.parseInt(scanner.nextLine());
                    if (index< stringList.size()-1){
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("lựa chọn không đúng");
                }
            }
            Facility serviceName = stringList.get(index - 1);


            for (Booking b : bookingSet) {
                if (b.getServiceName().getServiceName().equals(serviceName.getServiceName())) {
                    if (DAYS.between(b.getEndDay(), startDay) < 0 && DAYS.between(b.getStartDay(), startDay) >= 0) {
                        System.out.println("Đã có booking trùng");
                        return;
                    } else if (DAYS.between(endDay, b.getStartDay()) < 0 && DAYS.between(startDay, b.getStartDay()) > 0) {
                        System.out.println("Đã có booking trùng");
                        return;
                    }
                }
            }
            facilityIntegerMap.replace(serviceName, facilityIntegerMap.get(serviceName) + 1);
            ReadAndWrite.writeFacilityToCSV(facilityIntegerMap, FACILITY_PATH_FILE, false);
            Set<Booking> bookingSet1 = new TreeSet<>();
            bookingSet1.add(new Booking(bookingCode, startDay, endDay, customer, serviceName));
            ReadAndWrite.writeBookingToCSV(bookingSet1, BOOKING_PATH_FILE, true);
            MaintenanceService maintenanceService = new MaintenanceServiceImpl();
            maintenanceService.add();
            System.out.println("booking thành công!");

        }





    @Override
    public void edit() {

    }
}
