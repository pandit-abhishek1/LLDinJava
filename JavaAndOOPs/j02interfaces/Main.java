package JavaAndOOPs.j02interfaces;

public class Main {
    public static void main (String[] args){
        Car car1 = new Car();
        car1.start();
        car1.stop();
        car1.Owner(); // Calling the default method from the interface
        System.out.println("Sum: " + BlueprintForClass.add(5, 10));
        
        System.out.println("------------------");
        
        Car car2 = new Car();
        car2.start();
        car2.stop();
    }
}
