package ss3_array.bai_tap;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2};
        tes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void tes(int[] arr) {
        int [] a ={100,200};
        arr = a;
    }
}
