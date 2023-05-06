package Recursion;

import java.util.Scanner;

public class PowerFind {
    public static double powerFind(double a, double b) {
        double result = 0;
        if (b <= 1) {
            return a;
        } else {
            result = a * powerFind(a, b - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the a and b number");
            double a = sc.nextInt();
            double b = sc.nextInt();
            double result = powerFind(a, b);
            System.out.println("Power of Given number: " + result);
        }
    }
}
