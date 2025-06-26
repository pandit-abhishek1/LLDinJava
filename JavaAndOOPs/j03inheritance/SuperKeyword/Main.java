package JavaAndOOPs.j03inheritance.SuperKeyword;

class Animal {
    String color="white";
    Animal(String color) {
        this.color= color;
        System.out.println("Animal Constructor");
    }
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cow extends Animal {
    Cow() {
        super("black"); // Calls the parent class constructor
        System.out.println("Cow Constructor");
    }
    void makeSound() {
        super.makeSound(); // Calls parent method
        System.out.println("Cow moos");
    }
}
public class Main {
    public static void main(String[] args){
        Cow cow = new Cow();
        cow.makeSound();
    }
}
