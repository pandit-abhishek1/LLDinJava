package JavaAndOOPs.j06Encapsulation.GeterAndSeter;

public class Main {
    public static void main (String []  args){
        Employee employee= new Employee();
        employee.setName("Abhishek Pandey");
        employee.setAge(30);
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
    }
}
