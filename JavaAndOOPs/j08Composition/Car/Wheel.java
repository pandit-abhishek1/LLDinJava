package JavaAndOOPs.j08Composition.Car;

public class Wheel {
    private String type;

    public Wheel(String type) {
        this.type = type;
    }

    public void rotate() {
        System.out.println("The " + type + " wheel is rotating.");
    }
}
