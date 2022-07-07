package service.implement;

import common.CheckAge;
import common.UserException;
import model.person.Employee;
import service.EmployeeService;
import ultility.IncreaseID;
import ultility.ReadAndWrite;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeImpl implements EmployeeService {
    private static ArrayList<String> levellist = new ArrayList();
    private static LinkedList<String> positionList = new LinkedList<>();
    private static ArrayList<Employee> employeeList = new ArrayList();
    private static final String EMPLOYEE_CSV_PATH ="src/data/EmployeeCSV.csv";
    Scanner scanner = new Scanner(System.in);

    static {
        levellist.add("Trung cấp");
        levellist.add("Cao Đẳng");
        levellist.add("Đại học");
        levellist.add("Sau đại học");

        positionList.add("Lễ tân");
        positionList.add("phục vụ");
        positionList.add("chuyên viên");
        positionList.add("gimme sát");
        positionList.add("quản lý");
        positionList.add("giám đốc");
    }

    @Override
    public void display() {
        List<Employee> employeeList = ReadAndWrite.readEmployeeToCSV(EMPLOYEE_CSV_PATH);
        if (employeeList.isEmpty()){
            System.out.println("Chưa có nhân viên được thêm vào");
        }else
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        String id;
//        boolean flag=false;
//
//        do {
//            int count=0;
//            System.out.println("Nhập mã nhân viên");
//            id = scanner.nextLine();
//            List<Employee> employeeList = ReadAndWrite.readEmployeeToCSV(EMPLOYEE_CSV_PATH);
//            for (Employee e:employeeList) {
//                if (e.getID().equals(id)){
//                    System.out.println("ID đã tồn tại, vui lòng nhập ID mới");
//                    flag = true;
//                    count++;
//                    break;
//                }
//            }
//            if(count==0) flag = false;
//
//        }while (flag);
            id = IncreaseID.increaseEmployeeID()+"";

        System.out.println("Nhập tên nhân viên");
        String name = scanner.nextLine();

        LocalDate dayOfBirth ;
        do{
            try {
                System.out.println("nhập ngày sinh nhân viên");
                dayOfBirth = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy") );
                if (CheckAge.checkAge(dayOfBirth)){
                    break;
                }else throw new UserException("Ngày sinh phải nhỏ hơn ngày hiện tại 18 năm, người dùng không được quá 100 tuổi");
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("Nhập không đúng định dạng");
            }
        }while(true);

        System.out.println("Nhập giới tính nhân viên");
        String gender = scanner.nextLine();
        System.out.println("Nhập CMND nhân viên");
        String personalCode = scanner.nextLine();
        System.out.println("Nhập SĐT nhân viên");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập email nhân viên");
        String email = scanner.nextLine();


        String level = "";
        String choose = "";
        do {
            System.out.println("Nhập trình độ nhân viên" +
                    "\n 1. Trung cấp" +
                    "\n 2. Cao Đẳng" +
                    "\n 3. Đại học" +
                    "\n 4. Sau đại học");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    level = "Trung cấp";
                    break;
                case "2":
                    level = "Cao Đẳng";
                    break;
                case "3":
                    level = "Đại học";
                    break;
                case "4":
                    level = "Sau đại học";
                    break;

                default:
                    System.out.println("Vui lòng chọn đúng loại bằng cấp");
            }
        } while (level.equals(""));

        String position = "";
        String choosePosition = "";
        do {
            System.out.println("Nhập trình độ nhân viên" +
                    "\n 1. Lễ tân" +
                    "\n 2. phục vụ" +
                    "\n 3. chuyên viên" +
                    "\n 4. Giám sát" +
                    "\n 5. Quản lý" +
                    "\n 6. Giám đốc");
            choosePosition = scanner.nextLine();
            switch (choosePosition) {
                case "1":
                    position = "Lễ tân";
                    break;
                case "2":
                    position = "Phục vụ";
                    break;
                case "3":
                    position = "Chuyên viên";
                    break;
                case "4":
                    position = "Giám sát";
                    break;
                case "5":
                    position = "Quản lý";
                    break;
                case "6":
                    position = "Giám đốc";
                    break;

                default:
                    System.out.println("Vui lòng chọn đúng loại chức vụ");
            }
        } while (position.equals(""));


        System.out.println("Nhập lương nhân viên");
        double salary = Double.parseDouble(scanner.nextLine());
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(id, name, dayOfBirth, gender, personalCode, phoneNumber, email, level, position, salary));
        ReadAndWrite.writeEmployeeToCSV(employeeList, EMPLOYEE_CSV_PATH, true);

    }

    @Override
    public void edit() {
        List<Employee> employeeList = ReadAndWrite.readEmployeeToCSV(EMPLOYEE_CSV_PATH);
        System.out.println("nhập mã nhân viên cần điều chỉnh");
        String id = scanner.nextLine();
        for (Employee e: employeeList) {
           if (e.getID().equals(id)){
               System.out.println("Nhập tên nhân viên");
               e.setName(scanner.nextLine());

               LocalDate dayOfBirth ;
               do{
                   try {
                       System.out.println("nhập ngày sinh khách hàng");
                       dayOfBirth= LocalDate.parse(scanner.nextLine(),DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                       if (CheckAge.checkAge(dayOfBirth)){
                           e.setDayOfBirth(dayOfBirth);
                           break;
                       }else throw new UserException("Ngày sinh phải nhỏ hơn ngày hiện tại 18 năm, người dùng không được quá 100 tuổi");

                   }catch (Exception e1){
                       e1.printStackTrace();
                       System.out.println("Nhập không đúng định dạng");
                   }
               }while(true);

               System.out.println("Nhập giới tính nhân viên");
               e.setGender(scanner.nextLine());
               System.out.println("Nhập CMND nhân viên");
               e.setPersonalCode(scanner.nextLine());
               System.out.println("Nhập SĐT nhân viên");
               e.setPhoneNumber(scanner.nextLine());
               System.out.println("Nhập email nhân viên");
               e.setEmail(scanner.nextLine());


               String level = "";
               String choose = "";
               do {
                   System.out.println("Nhập trình độ nhân viên" +
                           "\n 1. Trung cấp" +
                           "\n 2. Cao Đẳng" +
                           "\n 3. Đại học" +
                           "\n 4. Sau đại học");
                   choose = scanner.nextLine();
                   switch (choose) {
                       case "1":
                           level = "Trung cấp";
                           break;
                       case "2":
                           level = "Cao Đẳng";
                           break;
                       case "3":
                           level = "Đại học";
                           break;
                       case "4":
                           level = "Sau đại học";
                           break;

                       default:
                           System.out.println("Vui lòng chọn đúng loại bằng cấp");
                   }
               } while (level.equals(""));
                e.setLevel(level);
               String position = "";
               String choosePosition = "";
               do {
                   System.out.println("Nhập trình độ nhân viên" +
                           "\n 1. Lễ tân" +
                           "\n 2. phục vụ" +
                           "\n 3. chuyên viên" +
                           "\n 4. Giám sát" +
                           "\n 5. Quản lý" +
                           "\n 6. Giám đốc");
                   choosePosition = scanner.nextLine();
                   switch (choosePosition) {
                       case "1":
                           position = "Lễ tân";
                           break;
                       case "2":
                           position = "Phục vụ";
                           break;
                       case "3":
                           position = "Chuyên viên";
                           break;
                       case "4":
                           position = "Giám sát";
                           break;
                       case "5":
                           position = "Quản lý";
                           break;
                       case "6":
                           position = "Giám đốc";
                           break;

                       default:
                           System.out.println("Vui lòng chọn đúng loại chức vụ");
                   }
               } while (position.equals(""));
                e.setLevel(position);

               System.out.println("Nhập lương nhân viên");
               e.setSalary(Double.parseDouble(scanner.nextLine()));
               ReadAndWrite.writeEmployeeToCSV(employeeList,EMPLOYEE_CSV_PATH,false);
               return;
           }
        }
        System.out.println("Nhân viên chưa có dữ liệu");
    }
}
