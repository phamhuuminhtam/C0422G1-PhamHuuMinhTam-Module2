package ss2_loop_array.bai_tap;

public class PrimeUnder100 {
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
        for (int i=1; i<=100; i++){
            if (checkPrime(i)){
                System.out.println(i);
            }
        }
    }
}
