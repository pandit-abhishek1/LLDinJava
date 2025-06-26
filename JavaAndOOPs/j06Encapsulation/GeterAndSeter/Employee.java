package JavaAndOOPs.j06Encapsulation.GeterAndSeter;

public class Employee {
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age>0){
            this.age= age;
        }
        else {
            System.out.println("age must be positive.");
        }
    }
    public int getAge(){
        return age;
    }
}
