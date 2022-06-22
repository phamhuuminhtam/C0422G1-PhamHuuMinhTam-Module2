package ss13_search_algorithm.bai_tap;

import giai_thuat.A;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class FindMaxString {
    static String string = "abcabcdgabmnsxy";
    static Stack<Character> charList = new Stack<>();
    static Stack<Character> charList1 = new Stack<>();

    public static void main(String[] args) {
        for (int i = 0; i < string.length(); i++) {
            charList.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (charList.peek() < string.charAt(j)) {
                    charList.add(string.charAt(j));
                } else break;
            }
            if (charList.size() > charList1.size()) {
                charList1.clear();
                charList1.addAll(charList);
            }
            charList.clear();
        }
        for (Character c : charList1) {
            System.out.print(c);
        }
    }
}
