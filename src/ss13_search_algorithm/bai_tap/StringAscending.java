package ss13_search_algorithm.bai_tap;

import java.util.Stack;

public class StringAscending {
    //    static String string = "Welcome";
//    static Stack<Character> charList = new Stack<>();
//    public static void main(String[] args) {
//        charList.add(string.charAt(0));
//        for (int i = 1; i < string.length() ; i++) {
//            if( string.charAt(i) > charList.peek()){
//                charList.add(string.charAt(i));
//            }
//        }
//        for (Character c: charList){
//            System.out.print(c);
//        }
//    }
    static String string = "Welcome";
    static Stack<Character> charList = new Stack<>();
    static Stack<Character> charList1 = new Stack<>();

    public static void main(String[] args) {


        for (int i = 0; i < string.length(); i++) {
            charList.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (charList.peek() < string.charAt(j)) {
                    charList.add(string.charAt(j));
                }
            }
            if (charList.size() > charList1.size()) {
                charList1.clear();
                charList1.addAll(charList);
            }
            charList.clear();
        }
        for (
                Character c : charList1) {
            System.out.print(c);
        }
    }
}

