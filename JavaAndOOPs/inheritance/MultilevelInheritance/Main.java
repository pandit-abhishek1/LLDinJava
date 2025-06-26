package JavaAndOOPs.inheritance.MultilevelInheritance;

class Grandparent {
    void show() {
        System.out.println("Grandparent class");
    }
}

class Parent extends Grandparent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("Child class");
    }
}
public class Main {
    public static void main (String[] args){
        Child child = new Child();
        child.show();    // Calling grandparent class method
        child.display(); // Calling parent class method
        child.print();   // Calling child class method
    }
}
