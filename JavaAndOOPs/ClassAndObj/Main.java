package JavaAndOOPs.ClassAndObj;

public class Main {
    public static void main (String[] args){
        Car car1 = new Car("Red","India","Model k",2020);
        Car car2 = new Car("Blue", "Pandey ji ke Company mein","Model S",2022);
        car1.displayInfo();
        System.out.println("------------------");
        car2.displayInfo();
    }
}