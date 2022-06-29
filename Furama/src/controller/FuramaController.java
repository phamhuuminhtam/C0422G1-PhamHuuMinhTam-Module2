package controller;

import service.implement.CustomerImpl;
import service.implement.EmployeeImpl;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.println("CHỨC NĂNG" +
                    "\n 1. Employee Management" +
                    "\n 2. Customer Management" +
                    "\n 3. Facility Management " +
                    "\n 4. Booking Management" +
                    "\n 5. Promotion Management" +
                    "\n 6. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    flag = false;
                    break;

                default:
                    System.out.println("Wrong choice! Choose again please!");
            }
        } while (flag);
    }

    private static void employeeManagement() {
        EmployeeImpl employee = new EmployeeImpl();
        boolean flag = true;
        do {
            System.out.println("Employee Management" +
                    "\n 1.Display list employees" +
                    "\n 2.Add new employee" +
                    "\n 3.Edit employee " +
                    "\n 4.Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    employee.display();
                    break;
                case 2:
                    employee.add();
                    break;
                case 3:
                    employee.edit();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong choice! Choose again please!");
            }
        } while (flag);
    }

    private static void customerManagement() {
        CustomerImpl customer = new CustomerImpl();
        boolean flag = true;
        do {
            System.out.println("Customer Management " +
                    "\n 1.Display list customers" +
                    "\n 2.Add new customers" +
                    "\n 3.Edit customers " +
                    "\n 4.Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    customer.display();
                    break;
                case 2:
                    customer.add();
                    break;
                case 3:
                    customer.edit();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong choice! Choose again please!");
            }
        } while (flag);

    }

    private static void facilityManagement() {
        boolean flag = true;
        do {
            System.out.println("Facility Management " +
                    "\n 1.Display list facility" +
                    "\n 2.Add new facility" +
                    "\n 3.Display list facility maintenance" +
                    "\n 4.Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong choice! Choose again please!");
            }
        } while (flag);
    }

    private static void bookingManagement() {
        boolean flag = true;
        do {
            System.out.println("Booking Management " +
                    "\n 1.Add new booking" +
                    "\n 2.Display list booking" +
                    "\n 3.Create new constracts" +
                    "\n 4.Display list contracts+" +
                    "\n 5.Edit contracts+" +
                    "\n 6.Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong choice! Choose again please!");
            }
        } while (flag);
    }

    private static void promotionManagement() {
        boolean flag = true;
        do {
            System.out.println("Promotion Management " +
                    "\n 1.Display list customers use service" +
                    "\n 2.Display list customers get voucher" +
                    "\n 3.Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:

                    break;
                case 2:

                    break;

                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong choice! Choose again please!");
            }
        } while (flag);
    }

}
