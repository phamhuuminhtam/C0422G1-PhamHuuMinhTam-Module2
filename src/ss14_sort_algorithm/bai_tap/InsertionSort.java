package ss14_sort_algorithm.bai_tap;


import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr1 = {12,5,7,9,1,20,25,8};
        System.out.println(Arrays.toString(arr1));
        System.out.println("-----------------");
        insertionSort(arr1);


    }

    public  static  int[] insertionSort(int[]arr){
        for (int i = 1; i <arr.length ; i++) {

            int pos = i;
            int x = arr[i];
            System.out.println("Lấy ra phần tử thứ " + i + " có giá trị "+ x);
            while (pos >0 && x < arr[pos-1]){
                System.out.println("-----Dịch chuyển vị trí " + (pos-1) + " sang " + pos);
                arr[pos] = arr[pos-1];
               pos--;
                System.out.println(Arrays.toString(arr));

            }
            System.out.println("-Chèn " + x + " vào vị trí " + pos);
            arr[pos]= x;
            System.out.println(Arrays.toString(arr));
        }
        return arr;

    }
}
