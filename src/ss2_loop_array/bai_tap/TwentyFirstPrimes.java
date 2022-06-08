package ss2_loop_array.bai_tap;


import java.util.Scanner;

public class TwentyFirstPrimes {
    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number of prime needed to print:");
        int numPrime = Integer.parseInt(scanner.nextLine());
        while (count < numPrime) {
            if (checkPrime(num)) {
                System.out.println((count + 1) + ". " + num);
                count++;
            }
            num++;
        }
    }
}




