package Java_D_S_A;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        // for (int i = 1; i <= num; i++) {
        // sum += i;
        // }
        sum = (num * (num + 1)) / 2;
        System.out.println(sum);
    }
}
