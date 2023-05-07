package Java_D_S_A;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // size of an element from the user
            System.out.println("Enter the number of element in present in a array");
            int n = sc.nextInt();

            // array element entered from the user
            System.out.println("Enter the array element");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // enter the target element
            System.out.println("Enter target element");
            int target = sc.nextInt();

            // implement of linear search
            int idx = 1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == target) {
                    idx = i;
                    break;
                }
            }
            if (idx == -1) {
                System.out.println("Searched element is not found in a array:");
            } else {
                System.out.println("Searched element is found at the location: " + idx);
            }
        }
    }
}
