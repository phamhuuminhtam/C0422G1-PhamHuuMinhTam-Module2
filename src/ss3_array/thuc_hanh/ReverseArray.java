package ss3_array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20){
                System.out.println("size does not exceed 20");
            }
        } while (size >20);
        array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i+1) + ":");
            array[i]= Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Array Input: " +Arrays.toString(array));
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[size -1 -i];
            array[size-1-i] = temp;
        }
        System.out.println("Reverse array:" + Arrays.toString(array));
    }
}
