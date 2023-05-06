package Java_D_S_A;

public class Palindrome {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1 };
        int n = arr.length;
        int flag = 0;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                flag = 1;
                System.out.println("Not an Palindrome");
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Its palindrome");
        }
    }
}

// public static void main(String[] args) {
// int[] array = { 1, 2, 3, 2, 1 };
// int n = array.length;
// int flag = 0;
// for (int i = 0; i < n / 2; i++) {
// if (array[i] != array[n - i - 1]) {
// flag = 1;
// System.out.println("Not Palindrome array");
// break;
// }
// }
// if (flag == 0) {
// System.out.println("It is Palindrome array");
// }
// }