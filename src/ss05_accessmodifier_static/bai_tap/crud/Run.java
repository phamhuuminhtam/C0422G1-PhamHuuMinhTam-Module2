package ss05_accessmodifier_static.bai_tap.crud;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        displayMenu();
    }
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Display");
            System.out.println("2. ADD");
            System.out.println("3.Delete");
            System.out.println("4.Exit");
            System.out.println("Input your choice");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    StudentManager.display();
                    break;
                case 2:
                    StudentManager.add();

                    break;
                case 3:
                    StudentManager.delete();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        } while (choice != 4);
    }
}
