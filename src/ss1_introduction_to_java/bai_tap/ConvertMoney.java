package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input USD: ");
        usd = Double.parseDouble(scanner.nextLine());
        System.out.println( usd + " usd = "+ usd *vnd +" vnd");
    }
}
