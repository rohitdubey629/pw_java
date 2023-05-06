package Recursion;

import java.util.Scanner;

class FactorialFind {
    public static int factorialFind(int n) {
        int result = 0;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            result = n * factorialFind(n - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            int result = factorialFind(n);
            System.out.println("Factorial of a given number: " + result);
        }
    }
}