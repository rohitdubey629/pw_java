package Java_D_S_A;

public class Reverse {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 8, 10 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.println("Reverse of an array id:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// public static void main(String[] args) {
// int[] arr = { 1, 2, 3, 5, 8, 10 };
// int n = arr.length;
// for (int i = 0; i < n / 2; i++) {
// int temp = arr[i];
// arr[i] = arr[n - i - 1];
// arr[n - i - 1] = temp;
// }
// System.out.println("Reverse of an array is;");

// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }