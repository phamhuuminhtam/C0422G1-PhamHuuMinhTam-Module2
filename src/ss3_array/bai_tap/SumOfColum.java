package ss3_array.bai_tap;

import java.util.Scanner;

public class SumOfColum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array2D = createArray();
        int sum = 0;
        System.out.println("Enter Colum want to sum: ");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (j == array2D.length - 1) {
                    System.out.print(array2D[i][j]);
                } else {
                    System.out.print(array2D[i][j] + ",");
                }
                if (j == num) {
                    sum += array2D[i][j];
                }
            }
            System.out.println();

        }
        System.out.println("sum of colum " + num + ": " + sum);
    }

    public static int[][] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number of cols: ");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] array2D = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter Element [" + i + "][" + j + "]: ");
                array2D[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        return array2D;
    }
}

