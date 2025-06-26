package JavaAndOOPs.j04polymorphism.OverridewithInterface;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }
    @Override
    public void stop() {
        System.out.println("Bike is stopping...");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car();
        myVehicle.start();
        myVehicle.stop();
        myVehicle = new Bike();
        myVehicle.start();
        myVehicle.stop();
    }
}
