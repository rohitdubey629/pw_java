package Interface;

interface Car1 {
    void drive();
}

interface Car2 {
    void drive(int a);
}

interface Car3 {
    void drive(int a, int b);
}

public class FInterfaceAndLambda {
    public static void main(String[] args) {

        // first
        // Car1 obj = new Car1() {
        // public void drive() {
        // System.out.println("Driving....");
        // }
        // };

        // Car2 obj2 = new Car2() {
        // public void drive(int a) {
        // System.out.println("Driving...." + a);
        // }
        // };

        // Car3 obj3 = new Car3() {
        // public void drive(int a, int b) {
        // System.out.println("Driving...." + (a + b));
        // }
        // };

        // secund
        // Car1 obj = () -> {
        // System.out.println("Driving....");
        // };

        // Car2 obj2 = (int a) -> {
        // System.out.println("Driving...." + a);
        // };

        // Car3 obj3 = (int a, int b) -> {
        // System.out.println("Driving...." + (a + b));

        // };

        // third lambda
        // Car1 obj = () -> System.out.println("Driving....");
        // Car2 obj2 = a -> System.out.println("Driving...." + a);

        Car3 obj3 = (int a, int b) -> System.out.println("Driving...." + (a + b));

        // obj.drive();
        // obj2.drive(10);
        obj3.drive(10, 20);

    }
}
