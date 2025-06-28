package JavaAndOOPs.j08Composition;

interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Petrol Engine started.");
    }
}

class DieselEngine implements Engine {
    public void start() {
        System.out.println("Diesel Engine started.");
    }
}

class myCar {
    private Engine engine;

    public myCar(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start();
        System.out.println("Car is ready to go!");
    }
}

public class InterfaceCompositionExample {
    public static void main(String[] args) {
        myCar petrolCar = new myCar(new PetrolEngine());
        petrolCar.startCar();

        myCar dieselCar = new myCar(new DieselEngine());
        dieselCar.startCar();
    }
}