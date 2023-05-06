package Interface;

interface Computer {
    void compileCode();
}

class Laptop implements Computer {

    public void compileCode() {
        System.out.println("you got 4 error");
    }
}

class Desktop implements Computer {
    public void compileCode() {
        System.out.println("you got 4 error fast");
    }
}

class Developer {
    public void buildApp(Computer obj) {
        System.out.println("Building App");
        obj.compileCode();
    }
}

public class Interface2 {
    public static void main(String[] args) {
        // Computer obj =new Computer();//error
        Desktop d = new Desktop();
        Developer obj = new Developer();
        Laptop l = new Laptop();
        obj.buildApp(l);
        obj.buildApp(d);

    }
}
