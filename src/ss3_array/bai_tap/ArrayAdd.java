package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {
        int[] array1= createArray();
        int[] array2 = createArray();

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int[] array3= mergeArray(array1,array2);
        System.out.println(Arrays.toString(array3));
    }
    public static int[] createArray(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter Element "+ (i+1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        return  array;
    }
    public static int[] mergeArray(int[] array1, int[] array2){
        int[] array3 = new int[array1.length+array2.length];
        System.arraycopy(array1,0,array3,0,array1.length);
        System.arraycopy(array2,0,array3,array3.length-array1.length,array2.length);
        return array3;
    }
}
