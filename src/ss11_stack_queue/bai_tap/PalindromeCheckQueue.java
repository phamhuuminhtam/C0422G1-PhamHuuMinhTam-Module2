package ss11_stack_queue.bai_tap;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckQueue {
    static Queue<Character> queue = new ArrayDeque<>() ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String need to check:");
        String string = scanner.nextLine();
        String stringNew = string.toLowerCase();
//        System.out.println(stringNew);
        for (int i = 0; i < stringNew.length(); i++) {

            queue.add(stringNew.charAt(i));
        }
        if (checkPalindrome(stringNew)) {
            System.out.println("This is Palindrome String");
        } else System.out.println("This is  NOT Palindrome String");

    }

    public static boolean checkPalindrome(String string) {
        for (int i = string.length()-1; i >=0; i--) {
            if (queue.poll() != string.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
