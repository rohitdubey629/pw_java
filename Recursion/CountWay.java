package Recursion;

import java.util.Scanner;

public class CountWay {
    public static int countFind(int n) {
        if (n <= 1) {
            return n;
        } else {
            return countFind(n - 1) + countFind(n - 2);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of stairs");
            int n = sc.nextInt();
            int result = countFind(n + 1);
            System.out.println("The number of way are: " + result);
        }
    }
}
