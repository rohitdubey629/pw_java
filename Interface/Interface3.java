package Interface;

interface A {
    void show();
}

interface B {
    void abc();
}

class C implements A, B {
    public void show() {
        System.out.println("in show");
    }

    public void abc() {
        System.out.println("in abc");
    }

}

public class Interface3 {
    public static void main(String[] args) {

        A obj = new C();
        B obj1 = new C();
        // obj.show();
        // obj1.abc();

        C obj2 = new C();
        obj2.abc();
        obj2.show();
    }

}
