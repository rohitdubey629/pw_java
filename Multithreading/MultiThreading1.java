package Multithreading;

public class MultiThreading1 {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t);
        t.setName("rohit");
        t.setPriority(8);
        System.out.println(t);

    }
}
