package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array size");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array= new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Element " + (i + 1) + ":");
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Array is: " + Arrays.toString(array));

        int ind;

        do {
            System.out.println("Enter Index of Element you want to Add: ");
            ind = Integer.parseInt(scanner.nextLine());
            if (ind <= -1 || ind > array.length - 1) {
                System.out.println("Index is not Exist");
            }
        } while (ind <= -1 || ind > array.length - 1);

        System.out.println("Enter Element you want to Add: ");
        int add = Integer.parseInt(scanner.nextLine());

        for (int i = array.length - 1; i > ind; i--) {
            array[i] = array[i - 1];
        }

        array[ind] = add;
        System.out.println("Array after add: " + Arrays.toString(array));
    }
}
