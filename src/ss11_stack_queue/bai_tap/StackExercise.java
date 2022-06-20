package ss11_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack();
        System.out.println("Enter Array size:");
        int num = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter " + (i + 1) + " Element: ");

            arr[i] = Integer.parseInt(scanner.nextLine());
            stack.add(arr[i]);
        }
        System.out.println("Array before: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("Array after get in stack: " + Arrays.toString(arr));

        //reverse String
        Stack<Character> wStack = new Stack<>();
        System.out.println("Enter a String: ");
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            wStack.add(string.charAt(i));
        }
        String stringNew = "";
        for (int i = 0; i < string.length(); i++) {
            stringNew += wStack.pop();
        }
        System.out.println("String after reverse :\n" + stringNew);

    }
}
