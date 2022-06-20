package ss11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheck {
    static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String need to check:");
        String string = scanner.nextLine();
        String stringNew = string.toLowerCase();
//        System.out.println(stringNew);
        for (int i = 0; i < stringNew.length(); i++) {

            stack.push(stringNew.charAt(i));
        }
        if (checkPalindrome(stringNew)) {
            System.out.println("This is Palindrome String");
        } else System.out.println("This is  NOT Palindrome String");

    }

    public static boolean checkPalindrome(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (stack.pop() != string.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
