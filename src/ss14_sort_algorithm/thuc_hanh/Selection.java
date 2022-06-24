package ss14_sort_algorithm.thuc_hanh;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        double[] arr = {9,8,7,6,5,4,3,2,1};

        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            double minValue = arr[i];
            System.out.println("i = " + i);
            System.out.println(Arrays.toString(arr));

            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(" j=" + j);
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minPos = j;
                }
            }
            System.out.println("vị trí mang giá trị nhỏ nhất là :" + minPos);
            System.out.println("đổi giá trị ở vị trí " + i + " là " + arr[i] + " cho vị trí  " + minPos + " là : " + arr[minPos]);
            arr[minPos] = arr[i] ;
            arr[i] = minValue;

            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
