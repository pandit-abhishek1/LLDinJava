package JavaAndOOPs.inheritance.SingleInheritance;

class Parent {
    void show() {
        System.out.println("This is the parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is the child class");
    }
}
public class Main {
    public static void main(String[] args){
        Child child = new Child();
        child.show();    // Calling parent class method
        child.display(); // Calling child class method
    }
}
