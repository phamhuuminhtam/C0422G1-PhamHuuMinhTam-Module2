package ss2_loop_array.thuc_hanh;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra");
        int num = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        if (num < 2) {
            check = false;
        } else {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if (check) {
            System.out.println(num + " là số nguyên tố");
        } else System.out.println(num + " không phải số nguyên tố");
    }
}