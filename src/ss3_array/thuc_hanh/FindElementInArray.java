package ss3_array.thuc_hanh;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's Student: ");
        String inputName = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                check = true;
                System.out.println("Position of the students in the list " + inputName + "Index is: " + i);
                break;
            }
        }
        if (!check) {
            System.out.println("Not found" + inputName + " in the list.");
        }
    }
}
