package Inheritance;

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
    public void carryGoods() {
        System.out.println("CargoPlane CarryGoods");
    }
}

class PassengerPlane extends AeroPlane {
    @Override
    public void fly() {
        System.out.println("PassengerPlane is Flying at Medium height");
    }

    // Specialized methods
    public void carryPassenger() {
        System.out.println("PassengerPlane carryPassenger");
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        PassengerPlane pp = new PassengerPlane();
        pp.carryPassenger();
        pp.fly();
        pp.takeOff();

    }
}
