import java.io.*;

class Cricketer1 implements Serializable {
    private String name;
    private int age;
    private int runs;

    public Cricketer1(String name, int age, int runs) {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }

    public void disp() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);

    }
}

public class Deserialization1 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("pw.text");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        try {
            Cricketer1 cr = (Cricketer1) ois.readObject();
            cr.disp();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
