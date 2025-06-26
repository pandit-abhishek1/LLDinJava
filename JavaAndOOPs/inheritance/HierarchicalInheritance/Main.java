package JavaAndOOPs.inheritance.HierarchicalInheritance;

class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child1 extends Parent {
    void display() {
        System.out.println("Child1 class");
    }
}

class Child2 extends Parent {
    void print() {
        System.out.println("Child2 class");
    }
}
public class Main {
    public static void main(String[] args){
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();

        child1.show();    // Calling parent class method
        child1.display(); // Calling child1 class method
        child2.show();    // Calling parent class method
        child2.print();   // Calling child2 class method
    }
}
