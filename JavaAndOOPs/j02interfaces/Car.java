package JavaAndOOPs.j02interfaces;

public class Car implements BlueprintForClass {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
    
    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }
    
}
