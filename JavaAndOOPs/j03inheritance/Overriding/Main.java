package JavaAndOOPs.j03inheritance.Overriding;


public class Main {
    public static void main(String[] args){
        Animals animal = new Animals();
        animal.sound(); // Calling method from Animals class

        Cow cow = new Cow();
        cow.sound(); // Calling overridden method from Cow class

    }
}
