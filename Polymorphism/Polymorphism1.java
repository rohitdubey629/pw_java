package Polymorphism;

class AeroPlane {
    public void takeOff() {
        System.out.println("AeroPlane is taking off");
    }

    public void fly() {
        System.out.println("AeroPlane is Flying");
    }
}

class CargoPlane extends AeroPlane {
    @Override
    public void fly() {
        System.out.println("CargoPlane is Flying at Lover height");
    }

    // Specialized methods
    public void takeOff() {
        System.out.println("CargoPlane require longer runway");
    }
}

class PassengerPlane extends AeroPlane {
    @Override
    public void fly() {
        System.out.println("PassengerPlane is Flying at Medium height");
    }

    // Specialized methods
    public void takeOff() {
        System.out.println("PassengerPlane require medium size runway");
    }
}

class FighterPlane extends AeroPlane {
    @Override
    public void fly() {
        System.out.println("FighterPlane is Flying at high height");
    }

    // Specialized methods
    public void takeOff() {
        System.out.println("FighterPlane require small size runway");
    }
}

class Airport {
    public void poly(AeroPlane ref) {
        ref.fly();
        ref.takeOff();
        System.out.println("--------------------------------------------------");
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        CargoPlane cr = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        Airport a = new Airport();
        a.poly(cr);
        a.poly(pp);
        a.poly(fp);

    }

}
