package service.implement;

import common.CheckServiceName;
import model.facility.Facility;
import model.facility.Villa;
import ultility.ReadAndWrite;


import java.util.Map;
import java.util.Scanner;


public class VillaServiceImpl extends FacilityServiceImpl {

private static  final String FACILITY_PATH_FILE="src/data/FacilityCSV.csv" ;
    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
//
        String serviceCode;
        String regex = "^SVVL-\\d{4}$";
        do {
            System.out.println("nhập mã dich vụ : SVVL-YYYY, với YYYY là các số từ 0-9:");
            serviceCode = scanner.nextLine();
        } while (!CheckServiceName.checkValidateName(serviceCode,regex));


        String serviceName = "";
        String regexName = "^[A-Z]\\w+$";
        do {
            System.out.println("nhập tên dịch vụ (bắt đầu bằng ký tự hoa) :");

            serviceName = scanner.nextLine();
        } while (!CheckServiceName.checkValidateName(serviceName, regexName));
        double squareUse=0;
        while (true) {
            try {
                System.out.println("Nhập diện tích sử dụng (>30m2)");
                 squareUse = Double.parseDouble(scanner.nextLine());
                if (squareUse>30) break;
                else System.out.println("nhập sai định dạng");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("nhập sai định dạng!");
            }
        }
        double cost;
        while (true) {
            try {
                System.out.println("Nhập chi phí thuê");
                cost = Double.parseDouble(scanner.nextLine());
                if(cost>0)  break;
                else System.out.println("nhập sai định dạng");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("nhập sai định dạng!");
            }
        }
        int  numberOfPeople;
        while (true) {
            try {
                System.out.println("Nhập số người tối đa");
                numberOfPeople = Integer.parseInt(scanner.nextLine());
                if (numberOfPeople>0 && numberOfPeople<20) break;
                else System.out.println("nhập sai định dạng");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("nhập sai định dạng!");
            }
        }


        String rentalType="";
        String choose;
        do {
            System.out.println("Nhập kiểu thuê" +
                    "\n 1. Năm" +
                    "\n 2. Tháng" +
                    "\n 3. Ngày" +
                    "\n 4. Giờ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    rentalType = "Năm";
                    break;
                case "2":
                    rentalType = "Tháng";
                    break;
                case "3":
                    rentalType = "Ngày";
                    break;
                case "4":
                    rentalType = "Giờ";
                    break;

                default:
                    System.out.println("Vui lòng chọn đúng loại bằng cấp");
            }
        } while (rentalType.equals(""));


        System.out.println("Nhập tiêu chuẩn phòng");
        String roomStandard = scanner.nextLine();
        double poolArea;
        while (true) {
            try {
                System.out.println("Nhập diện tích hồ bơi (>30m2)");
                 poolArea = Double.parseDouble(scanner.nextLine());
                if (poolArea>30) break;
                else System.out.println("nhập sai định dạng");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("nhập sai định dạng!");
            }
        }
        int numberOfFloors;
        while (true) {
            try {
                System.out.println("Nhập số tầng");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                if(numberOfFloors>0)  break;
                else System.out.println("nhập sai định dạng");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("nhập sai định dạng!");
            }
        }

        Map<Facility,Integer> facilityIntegerMap = ReadAndWrite.readFacilityToCSV(FACILITY_PATH_FILE);
        facilityIntegerMap.put(new Villa(serviceCode,serviceName,squareUse,cost,numberOfPeople,rentalType,roomStandard,poolArea,numberOfFloors),0);
        ReadAndWrite.writeFacilityToCSV(facilityIntegerMap,FACILITY_PATH_FILE,false);
    }
}
