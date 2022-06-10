package ss1_introduction_to_java.bai_tap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input USD: ");
        usd = Double.parseDouble(scanner.nextLine());
        DecimalFormat f = new DecimalFormat("#0,000");

        System.out.printf( usd + " usd = "+ f.format(usd*vnd)  +" vnd");
    }
}
