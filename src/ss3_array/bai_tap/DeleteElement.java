package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array size");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Element " + (i + 1) + ":");
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Array is: " + Arrays.toString(array));
        System.out.println("Enter Element you want to Delete: ");
        int del = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == del) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                check = true;
            }
        }
        if (!check) {
            System.out.println(del + " is not found in Array");
        } else System.out.println("Array after delete: " + Arrays.toString(array));
    }
}