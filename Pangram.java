public class Pangram {
    public static void main(String[] args) {
        boolean flag = false;
        String str = "the Quick brown forx jumps over lazy dog";
        str = str.replace(" ", "");
        str = str.toUpperCase();

        char ch[] = str.toCharArray();
        int arr[] = new int[26];

        for (int i = 0; i < ch.length; i++) {
            arr[ch[i] - 65]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("It`s not pangram");
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("It`s Pangram");
        }
    }
}
