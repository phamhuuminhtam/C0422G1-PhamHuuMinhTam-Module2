package service.implement;

import common.CheckAge;
import common.UserException;
import model.person.Customer;
import model.person.Employee;
import service.CustomerService;
import ultility.IncreaseID;
import ultility.ReadAndWrite;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerImpl implements CustomerService {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> typeOfGuestList = new ArrayList<>();
    public static final String CUSTOMER_PATH_CSV = "src/data/CustomerCSV.csv";

    static {

        typeOfGuestList.add("Diamond");
        typeOfGuestList.add("Platinium");
        typeOfGuestList.add("Gold");
        typeOfGuestList.add("Silver");
        typeOfGuestList.add("Member");
    }

    @Override
    public void display() {
        List<Customer> customers = ReadAndWrite.readCustomerToCSV(CUSTOMER_PATH_CSV);
        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        String id;
        boolean flag = false;

//        do {
//            int count = 0;
//            System.out.println("Nhập mã khách hàng");
//            id = scanner.nextLine();
//            List<Customer> customerList = ReadAndWrite.readCustomerToCSV(CUSTOMER_PATH_CSV);
//            for (Customer e : customerList) {
//                if (e.getID().equals(id)) {
//                    System.out.println("ID đã tồn tại, vui lòng nhập ID mới");
//                    flag = true;
//                    count++;
//                    break;
//                }
//            }
//            if (count == 0) flag = false;
//
//        } while (flag);

         id = IncreaseID.increaseID()+"";
        System.out.println("nhập tên khách hàng");
        String name = scanner.nextLine();
        LocalDate dayOfBirth;
        do {
            try {
                System.out.println("nhập ngày sinh khách hàng");
                dayOfBirth = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                if (CheckAge.checkAge(dayOfBirth)) {
                    break;
                } else
                    throw new UserException("Ngày sinh phải nhỏ hơn ngày hiện tại 18 năm, người dùng không được quá 100 tuổi");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Nhập không đúng định dạng vui lòng nhập lại");
            }
        } while (true);

        System.out.println("nhập giới tính khách hàng");
        String gender = scanner.nextLine();
        System.out.println("nhập CMND khách hàng");
        String personalCode = scanner.nextLine();
        System.out.println("nhập số điện thoại khách hàng");
        String phoneNumber = scanner.nextLine();
        System.out.println("nhập email khách hàng");
        String mail = scanner.nextLine();

        String typeOfGuest = "";
        String choose = "";
        do {
            System.out.println("nhập loại khách hàng" +
                    "\n 1. Diamond+" +
                    "\n 2. Platinium" +
                    "\n 3. Gold" +
                    "\n 4. Silver" +
                    "\n 5. Member");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    typeOfGuest = "Diamond";
                    break;
                case "2":
                    typeOfGuest = "Platinium";
                    break;
                case "3":
                    typeOfGuest = "Gold";
                    break;
                case "4":
                    typeOfGuest = "Silver";
                    break;
                case "5":
                    typeOfGuest = "Member";
                    break;
                default:
                    System.out.println("Vui lòng chọn đúng loại khách hàng");
            }
        } while (typeOfGuest.equals(""));
        System.out.println("nhập địa chỉ khách hàng");
        String address = scanner.nextLine();
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(id, name, dayOfBirth, gender, personalCode, phoneNumber, mail, typeOfGuest, address));
        ReadAndWrite.writeCustomerToCSV(customers, CUSTOMER_PATH_CSV, true);
        System.out.println("Thêm mới thành công");

    }

    @Override
    public void edit() {
        List<Customer> customerList = ReadAndWrite.readCustomerToCSV(CUSTOMER_PATH_CSV);
        System.out.println("nhập mã khách hàng cần điều chỉnh");
        String id = scanner.nextLine();
        for (Customer e : customerList) {
            if (e.getID().equals(id)) {
                System.out.println("Nhập tên khách hàng");
                e.setName(scanner.nextLine());

                LocalDate dayOfBirth;
                do {
                    try {
                        System.out.println("nhập ngày sinh khách hàng");
                        dayOfBirth = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                        if (CheckAge.checkAge(dayOfBirth)) {
                            e.setDayOfBirth(dayOfBirth);
                            break;
                        } else
                            throw new UserException("Ngày sinh phải nhỏ hơn ngày hiện tại 18 năm, người dùng không được quá 100 tuổi");

                    } catch (Exception e1) {
                        e1.printStackTrace();
                        System.out.println("Nhập không đúng định dạng");
                    }
                } while (true);
                System.out.println("nhập giới tính khách hàng");
                e.setGender(scanner.nextLine());
                System.out.println("nhập CMND khách hàng");
                e.setPersonalCode(scanner.nextLine());
                System.out.println("nhập số điện thoại khách hàng");
                e.setPhoneNumber(scanner.nextLine());
                System.out.println("nhập email khách hàng");
                e.setEmail(scanner.nextLine());

                String typeOfGuest = "";
                String choose = "";
                do {
                    System.out.println("nhập loại khách hàng" +
                            "\n 1. Diamond+" +
                            "\n 2. Platinium" +
                            "\n 3. Gold" +
                            "\n 4. Silver" +
                            "\n 5. Member");
                    choose = scanner.nextLine();
                    switch (choose) {
                        case "1":
                            typeOfGuest = "Diamond";
                            break;
                        case "2":
                            typeOfGuest = "Platinium";
                            break;
                        case "3":
                            typeOfGuest = "Gold";
                            break;
                        case "4":
                            typeOfGuest = "Silver";
                            break;
                        case "5":
                            typeOfGuest = "Member";
                            break;
                        default:
                            System.out.println("Vui lòng chọn đúng loại khách hàng");
                    }
                } while (typeOfGuest.equals(""));
                e.setTypeOfGuest(typeOfGuest);
                System.out.println("nhập địa chỉ khách hàng");
                e.setAddress(scanner.nextLine());
                ReadAndWrite.writeCustomerToCSV(customerList, CUSTOMER_PATH_CSV, false);
                return;
            }
        }
        System.out.println("Khách hàng này chưa có dữ liệu");
    }
}