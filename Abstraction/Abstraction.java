package Abstraction;

abstract class AeroPlane {
    abstract public void takeOff();

    abstract public void fly();

    public void landing() {
        System.out.println("AeroPlane is landing");
    }
}

class CargoPlane extends AeroPlane {
    @Override
    public void fly() {
        System.out.println("CargoPlane is Flying at Lover height");
    }

    @Override
    public void takeOff() {
        System.out.println("CargoPlane require longer runway");
    }
}

class PassengerPlane extends AeroPlane {
    @Override
    public void fly() {
        System.out.println("PassengerPlane is Flying at Medium height");
    }

    @Override
    public void takeOff() {
        System.out.println("PassengerPlane require medium size runway");
    }
}

class FighterPlane extends AeroPlane {
    @Override
    public void fly() {
        System.out.println("FighterPlane is Flying at high height");
    }

    @Override
    public void takeOff() {
        System.out.println("FighterPlane require small size runway");
    }

    public void alert() {
        System.out.println("Alert...");
    }
}

class AirPort {
    public void poly(AeroPlane ref) {
        ref.fly();
        ref.takeOff();
        System.out.println("---------------------------------------------");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        // AeroPlane fp1 = new FighterPlane();
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();
        // cp.fly();
        // cp.takeOff();
        // ((FighterPlane) fp).alert(); // it is down costing

        AirPort a = new AirPort();
        a.poly(cp);
        a.poly(fp);
        a.poly(pp);

    }
}
