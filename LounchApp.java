import java.util.Scanner;

//without using oops concept

class Rectangle {
    float lenght;
    float breath;
    float area;

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

    public void disp() {
        System.out.println("The area of Rectangle: " + area);
    }
}

class Square {
    float lenght;
    float area;

    public void input() {
        System.out.println("Calculation of Square App :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght");
        lenght = sc.nextFloat();

    }

    public void compute() {
        area = lenght * lenght;
    }

    public void disp() {
        System.out.println("The area of Square: " + area);
    }
}

class Circle {
    float radius;
    float area;

    public void input() {
        System.out.println("Calculation of Circle App :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = sc.nextFloat();

    }

    public void compute() {
        area = 3.14f * radius * radius;
    }

    public void disp() {
        System.out.println("The area of Circle: " + area);
    }
}

public class LounchApp {
    public static void main(String[] args) {
        Rectangle rac = new Rectangle();
        rac.input();
        rac.compute();
        rac.disp();
        Square sqr = new Square();
        sqr.input();
        sqr.compute();
        sqr.disp();
        Circle cr = new Circle();
        cr.input();
        cr.compute();
        cr.disp();
    }
}