package JavaAndOOPs.inheritance.Basic;

public class Cow extends Animals {
    String color ="White";
    Cow (String color){
        super("Cow", 1); // Call the constructor of the parent class Animals
        this.color = color; // Set the color of the cow
    }
    @Override
     void Children () {
        System.out.println("Cow have calf.");
    }
    void moo() {
        System.out.println(Name + " is mooing.");
    }
}