package JavaAndOOPs.j01ClassAndObj;

public class Car {
    // Attribute 
    private String color;
    private String make;
    private String model;
    private int year;
    //  Constructor
    public Car (String color, String make, String model, int year){
        this.color = color;
        this.make= make;
        this.model= model;
        this.year = year;
    }
    public void displayInfo(){
        System.out.println("Car Make:"+ make);
        System.out.println("Car Model: "+ model);
        System.out.println("Car Year: "+ year);
        System.out.println("Car Color: "+ color);

    }
}
