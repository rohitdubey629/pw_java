package Java_D_S_A;

public class Missing {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7 };
        int n = arr.length;
        // sum of natural number
        int sum_of_natural_number = ((n + 1) * (n + 2)) / 2;
        int sum = 0;
        // sum of current element present in an array
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int missing = 0;
        System.out.println(sum + " " + sum_of_natural_number);
        missing = sum_of_natural_number - sum;
        System.out.println("Missing element :" + missing);

    }
}
