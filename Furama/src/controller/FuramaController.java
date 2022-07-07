package controller;

import service.BookingService;
import service.FacilityService;
import service.MaintenanceService;
import service.implement.*;
import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {

        do {
            System.out.println("CHỨC NĂNG" +
                    "\n 1. Employee Management" +
                    "\n 2. Customer Management" +
                    "\n 3. Facility Management " +
                    "\n 4. Booking Management" +
                    "\n 5. Promotion Management" +
                    "\n 6. Exit");
            Scanner scanner = new Scanner(System.in);

            String choose = null;
            do {
                try {
                    System.out.println("Chọn chức năng");
                    choose = scanner.nextLine();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (true);

            switch (choose) {
                case "1":
                    employeeManagement();
                    break;
                case "2":
                    customerManagement();
                    break;
                case "3":
                    facilityManagement();
                    break;
                case "4":
                    bookingManagement();
                    break;
                case "5":
                    promotionManagement();
                    break;
                case "6":
                    return;

                default:
                    System.out.println("Wrong choice! Choose again please!");
            }
        } while (true);
    }

    private static void employeeManagement() {
        EmployeeImpl employee = new EmployeeImpl();

        do {
            System.out.println("Employee Management" +
                    "\n 1.Display list employees" +
                    "\n 2.Add new employee" +
                    "\n 3.Edit employee " +
                    "\n 4.Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    employee.display();
                    break;
                case "2":
                    employee.add();
                    break;
                case "3":
                    employee.edit();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Wrong choice! Choose again please!");
            }
        } while (true);
    }

    private static void customerManagement() {
        CustomerImpl customer = new CustomerImpl();

        do {
            System.out.println("Customer Management " +
                    "\n 1.Display list customers" +
                    "\n 2.Add new customers" +
                    "\n 3.Edit customers " +
                    "\n 4.Return main menu");
            Scanner scanner = new Scanner(System.in);
            String choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    customer.display();
                    break;
                case "2":
                    customer.add();
                    break;
                case "3":
                    customer.edit();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Wrong choice! Choose again please!");
            }
        } while (true);

    }

    private static void facilityManagement() {

        FacilityService facilityService = new FacilityServiceImpl();
        MaintenanceService maintenanceService = new MaintenanceServiceImpl();

        do {
            System.out.println("Facility Management " +
                    "\n 1.Display list facility" +
                    "\n 2.Add new facility" +
                    "\n 3.Display list facility maintenance" +
                    "\n 4.Maintenance all Facility" +
                    "\n 5.Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    facilityService.display();
                    break;
                case "2":
                    facilityService.add();
                    break;
                case "3":
                    maintenanceService.display();
                    break;
                case "4":
                    maintenanceService.edit();
                case "5":
                    return;
                default:
                    System.out.println("Wrong choice! Choose again please!");
            }
        } while (true);
    }

    private static void bookingManagement() {
        BookingService bookingService = new BookingServiceImpl();


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
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    bookingService.add();
                    break;
                case "2":
                    bookingService.display();
                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":
                    return;
                default:
                    System.out.println("Wrong choice! Choose again please!");
            }
        } while (true);
    }

    private static void promotionManagement() {

        do {
            System.out.println("Promotion Management " +
                    "\n 1.Display list customers use service" +
                    "\n 2.Display list customers get voucher" +
                    "\n 3.Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":

                    break;
                case "2":

                    break;

                case "3":
                    return;
                default:
                    System.out.println("Wrong choice! Choose again please!");
            }
        } while (true);
    }


}
