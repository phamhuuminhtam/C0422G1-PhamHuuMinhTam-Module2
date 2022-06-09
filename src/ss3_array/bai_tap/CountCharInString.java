package ss3_array.bai_tap;

import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = scanner.nextLine();
        System.out.println("Enter a Char to check:");
        char c = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("char \"" + c + "\" is not found in String");
        }else System.out.println("char \"" + c + "\" appears " + count + " times");
    }
}
