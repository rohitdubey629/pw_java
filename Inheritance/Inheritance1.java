package Inheritance;

class Human {
    private String name;
    int age;

    Human() {
        System.out.println("Human class Constructor");
    }

    void sleep() {
        age = 18;
        System.out.println("Human need good sleep : " + age);
    }
}

class Student extends Human {
    // by default include constructor
    // public Student(){
    // super();
    // }
    void disp() {
        System.out.println("The age is : " + age);
    }
}

class Inheritance1 {
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep();
        st.disp();
    }
}