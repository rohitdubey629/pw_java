package Interface;

interface A1 {
    void show();

    default void config() {
        System.out.println("in config");

    }

    static void abc() {
        System.out.println("in static");
    }
}

class B1 implements A1 {
    public void show() {
        System.out.println("in show");
    }
}

public class NormalInterface {
    public static void main(String[] args) {
        A1.abc(); // access to direct class name because method is static
        A1 obj = new B1();
        obj.config();
        obj.show();
    }

}
