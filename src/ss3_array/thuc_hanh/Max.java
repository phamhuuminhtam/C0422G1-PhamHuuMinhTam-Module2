package ss3_array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter Array size: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.out.println(" Size should not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int max = array[0];
        int index = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Element " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            if (array[i]>= max){
                max = array[i];
                index = i;
            }
        }
        System.out.println("Array is: "+ Arrays.toString(array));
        System.out.println("Max is: " + max + " position Index: "  + index );
    }
}
