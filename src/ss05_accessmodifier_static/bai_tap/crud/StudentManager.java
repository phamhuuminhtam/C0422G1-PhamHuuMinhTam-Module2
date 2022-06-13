package ss05_accessmodifier_static.bai_tap.crud;


import java.util.Scanner;

public class StudentManager {

    static Student[] student = new Student[100];

    static {
        student[0] = new Student(1, "trí", "Đà Nẵng", "tringu", "C0422G1", false);
        student[1] = new Student(2,"vẹo", "Quảng Nam", "trikhongthongminh", "C0522G1", true);
        student[2] = new Student(3,"thẳng", "HCM", "trikhon", "C0622G1", true);
    }

    public static void display() {
        for (Student s : student) {
            if (s != null) {
                System.out.println(s);
            } else break;
        }
    }

    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new rollno");
        int rollno = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter new Name");
        String name = scanner.nextLine();
        System.out.println("Enter new Address");
        String address = scanner.nextLine();
        System.out.println("Enter new Email");
        String email = scanner.nextLine();
        System.out.println("Enter new Class");
        String classes = scanner.nextLine();
        System.out.println("Enter new Gender");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());

        for (int i = 0; i < student.length; i++) {
            if (student[i] == null) {
                student[i] = new Student(rollno, name, address, email, classes, gender);
                break;
            }
        }
        StudentManager.display();
    }

    public static void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Rollno need to Delelte");
        int rollCheck = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < student.length; i++) {
            if (student[i] == null) {
                break;
            }
            if (rollCheck == student[i].getRollno()) {

                if (student.length - 1 - i >= 0) System.arraycopy(student, i + 1, student, i, student.length - 1 - i);
            }
        }
        display();
    }

}

