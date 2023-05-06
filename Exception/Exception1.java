package Exception;

// class Demo1 {
//     public void a() {
//         b();
//     }

//     public void b() {
//         int num1 = 8;
//         int num2 = 0;
//         int result = num1 / num2;
//         System.out.println(result);
//     }
// }

// public class Exception1 {

//     public static void main(String[] args) {
//         Demo1 obj = new Demo1();
//         try {
//             obj.a();
//         } catch (Exception e) {
//             // TODO: handle exception
//             System.out.println(e);
//         }

//     }
// }

class Demo1 {
    public void a() throws Exception {
        b();
    }

    public void b() throws Exception {
        int num1 = 8;
        int num2 = 0;
        int result = num1 / num2;
        System.out.println(result);
    }
}

public class Exception1 {

    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        try {
            obj.a();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // it is not good
    // public static void main(String[] args) throws Exception {
    // Demo1 obj = new Demo1();
    // obj.a();
    // }
}
