package Multithreading;

class Car1 implements Runnable {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " Has Entered the parking lot");
            Thread.sleep(2000);
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " Go into Car to Drive");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Started to drive the Car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Came back in Parking the Car");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("some Problem");
        }
    }
}

public class SynchronizedThread2 {
    public static void main(String[] args) {
        Car1 c = new Car1();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        t1.setName("SON-1");
        t2.setName("SON-2");
        t3.setName("SON-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
