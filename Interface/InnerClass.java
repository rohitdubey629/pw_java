package Interface;

class A2 {
    public void show() {
        System.out.println("in show");

    }

    static class B2 {
        public void disp() {
            System.out.println("in display");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A2 obj = new A2();
        A2.B2 obj1 = new A2.B2();
        obj1.disp();
        obj.show();
    }
}
