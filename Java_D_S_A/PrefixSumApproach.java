package Java_D_S_A;

import java.util.Scanner;

public class PrefixSumApproach {

    public static void PrefixSumMatrix(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        // traversed the array row-wise to calculate the row-wise prefix sum
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
        // traversed the array column-wise to calculate the column-wise prefix sum
        // final 2d matrix
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }

    public static int sumRegion(int[][] arr, int r1, int c1, int r2, int c2) {
        int sum = 0, up = 0, left = 0, repeated_region = 0, result = 0;
        sum = arr[r2][c2];
        up = arr[r1 - 1][c2];
        left = arr[r2][c1 - 1];
        repeated_region = arr[r1 - 1][c1 - 1];
        result = sum - up - left + repeated_region;
        return result;
    }

    public static int findSumMatrix(int[][] arr, int r1, int c1, int r2, int c2) {
        int sum = 0;
        for (int i = r1; i < r2; i++) {
            for (int j = c1; j < c2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of row");
            int m = sc.nextInt();
            System.out.println("Enter number of column");
            int n = sc.nextInt();
            int arr[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            // print matrix
            // for (int i = 0; i < m; i++) {
            // for (int j = 0; j < n; j++) {
            // System.out.print(arr[i][j] + " ");
            // }
            // System.out.println();
            // }
            int r1, r2, c1, c2;
            System.out.println("Enter the value of r1 coordinate");
            r1 = sc.nextInt();
            System.out.println("Enter the value of c1 coordinate");
            c1 = sc.nextInt();
            System.out.println("Enter the value of r2 coordinate");
            r2 = sc.nextInt();
            System.out.println("Enter the value of c2 coordinate");
            c2 = sc.nextInt();

            // int result = findSumMatrix(arr,r1,c1,r2,c2);
            PrefixSumMatrix(arr);
            int result = sumRegion(arr, r1, c1, r2, c2);
            System.out.println("Sum of element of given rectangle is: " + result);
        }
    }
}
