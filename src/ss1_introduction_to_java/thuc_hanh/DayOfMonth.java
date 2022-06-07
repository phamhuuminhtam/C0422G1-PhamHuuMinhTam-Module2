package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want to count days? ");
        int month = scanner.nextInt();
//        switch (month){
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.println("The month '" + month + "' has 31 days!");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println("The month '" + month + "' has 30 days!");
//                break;
//            case 2:
//                System.out.println("The month '" + month + "' has 28 or 29 days!");
//                 break;
//            default:
//                System.out.print("Invalid input!");
        String dayInMonth;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "30";
                break;
            case 2:
                dayInMonth = "28 or 29";
                break;
            default:
              dayInMonth ="";

        }
        if (!dayInMonth.equals("")) {
            System.out.printf("The month '%d' has %s days!", month, dayInMonth);
        }
        else  {System.out.print("Invalid input!");
        }
    }
}
