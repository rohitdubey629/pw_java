package Multithreading;

class Car implements Runnable {
    synchronized public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " Has Entered the parking lot");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Go into Car to Drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Started to drive the Car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Came back in Parking the Car");
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("some Problem");
        }
    }
}

public class SynchronizedThread1 {
    public static void main(String[] args) {
        Car c = new Car();

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
