package ss11_stack_queue.bai_tap;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeStackQueue {
    public static class PalindromeCheckQueue {
        static Queue<Character> queue = new ArrayDeque<>();
        static Stack<Character> stack = new Stack<>();

        public static void main(String[] args) {
            boolean flag = true;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter String need to check:");
            String string = scanner.nextLine();
            String stringNew = string.toLowerCase();
//        System.out.println(stringNew);
            for (int i = 0; i < stringNew.length(); i++) {
                stack.add(stringNew.charAt(i));
                queue.add(stringNew.charAt(i));
            }
            for (int i = 0; i < stringNew.length(); i++) {
                if (stack.pop() == queue.poll()) {
                    continue;
                } else flag = false;
            }
            if (flag){
                System.out.println("IS a Palindrome String");
            }else System.out.println("IS NOT a Palindrome String");

        }
    }
}
