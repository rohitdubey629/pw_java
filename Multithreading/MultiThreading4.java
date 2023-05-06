package Multithreading;

class Calc1 implements Runnable {
    public void run() {
        System.out.println("this is implements in calc class");
    }
}

class Message1 implements Runnable {
    public void run() {
        System.out.println("this in implements in message class");
    }
}

public class MultiThreading4 {
    public static void main(String[] args) {
        Calc1 c = new Calc1();
        Message1 m = new Message1();
        Thread t = new Thread(c);
        Thread t1 = new Thread(m);

        t.start();
        t1.start();
    }
}
