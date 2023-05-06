package Multithreading;

class MyThread1 extends Thread {
    public void run() {
        System.out.println("myThread");
    }

}

public class MultiThreading2 {
    public static void main(String[] args) {
        System.out.println("Main Thread");

        MyThread1 t = new MyThread1();
        t.start();

    }
}
