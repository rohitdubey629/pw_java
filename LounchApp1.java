import notepadapp.about;
import java.util.*;
//using oops abstract inheritance poly

abstract class Shape {
    float area;

    abstract public void input();

    abstract public void compute();

    public void disp() {
        System.out.println("The area is: " + area);
    }
}

class Rectangle1 extends Shape {
    float lenght;
    float breath;

    public void input() {

        System.out.println("Calculation of Rectangle App :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght");
        lenght = sc.nextFloat();
        System.out.println("Enter the breath");
        breath = sc.nextFloat();
    }

    public void compute() {
        area = lenght * breath;
    }

}

class Square1 extends Shape {
    float lenght;

    public void input() {
        System.out.println("Calculation of Square App :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght");
        lenght = sc.nextFloat();

    }

    public void compute() {
        area = lenght * lenght;
    }

}

class Circle1 extends Shape {
    float radius;

    public void input() {
        System.out.println("Calculation of Circle App :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = sc.nextFloat();

    }

    public void compute() {
        area = 3.14f * radius * radius;
    }

}

class Poly {
    public void poly(Shape ref) {
        ref.input();
        ref.compute();
        ref.disp();
    }
}

public class LounchApp1 {
    public static void main(String[] args) {
        Rectangle1 rct = new Rectangle1();
        Square1 scr = new Square1();
        Circle1 sr = new Circle1();
        Poly p = new Poly();
        p.poly(rct);
        p.poly(scr);
        p.poly(sr);

    }
}
