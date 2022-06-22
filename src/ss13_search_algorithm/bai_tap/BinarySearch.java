package ss13_search_algorithm.bai_tap;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] array, int left, int right ,int value){
         int middle = (left + right)/2;
         if (array[middle] == value) return middle;
         if (value > array[middle]) return binarySearch(array,(middle +1),right, value );
         if (value < array[middle]) return binarySearch(array, left,(middle-1),  value);
         return -1;
    }

    public static void main(String[] args) {
        int[] arr = {30,19,20,25,17,40,5,1,99,100};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,0,arr.length-1,100));
    }
}
