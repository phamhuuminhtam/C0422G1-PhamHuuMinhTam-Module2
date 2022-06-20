package ss11_stack_queue.bai_tap;

import jdk.nashorn.internal.ir.Symbol;

import java.util.Scanner;
import java.util.Stack;

public class BracketCheck {
    public static final char LEFTBRACKET = '(';
    public static final char RIGHTBRACKET = ')';
    public static Stack<Character> bStack = new Stack<>();

    public static void main(String[] args) {
        boolean flag= true;
        Stack<Character> bStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the expression to be checked");
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == LEFTBRACKET) {
                bStack.add(string.charAt(i));
            }
            if (string.charAt(i) ==RIGHTBRACKET){
                if (!bStack.isEmpty()){
                    bStack.pop();
                    continue;
                }else {
                    flag=false;
                    break;
                }
            }
        }
        if (flag){
            if (bStack.isEmpty()){
                System.out.println("true");
            }else System.out.println("false");
        }else System.out.println("false");

    }


}
