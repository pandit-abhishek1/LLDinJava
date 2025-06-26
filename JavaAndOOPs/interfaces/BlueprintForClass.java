package JavaAndOOPs.interfaces;

public interface BlueprintForClass {
    void start(); // Abstract method (no implementation)
    void stop();  // Abstract method (no implementation)
    // Default method with implementation
    // Java 8 introduced default methods in interfaces, allowing methods with a body.
    default void Owner() {
        System.out.println("Abhishek Pandey...");
    }
    // Static method with implementation
    // Java 8 also introduced static methods in interfaces, which can be called without an instance
    static int add(int a, int b) {
        return a + b;
    }
} 