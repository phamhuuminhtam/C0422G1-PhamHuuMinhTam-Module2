package ss11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class BinaryConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter number need to convert");
        int num = Integer.parseInt(scanner.nextLine());
        do {
            stack.add(num % 2);
            num = num / 2;
        } while (num > 0);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }
}

