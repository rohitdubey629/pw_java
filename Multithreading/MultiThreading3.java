package Multithreading;

import java.util.Scanner;

class Calc extends Thread {
    public void run() {
        String rname = Thread.currentThread().getName();
        System.out.println(rname);
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculation start");
        System.out.println("Enter the first number");
        int num = sc.nextInt();
        System.out.println("Enter the secund number");
        int num1 = sc.nextInt();
        int res = num + num1;
        System.out.println(res);
        System.out.println("Calculation End");
        System.out.println("----------------------------------------");
    }
}

class Message extends Thread {
    public void run() {
        System.out.println("Start in a Message");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Focus is important to master skill");
                sleep(2000);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println("End in a Message");
    }
}

public class MultiThreading3 {
    public static void main(String[] args) {
        System.out.println("main thread");
        Calc c = new Calc();
        Message m = new Message();
        c.start();
        m.start();
    }
}
