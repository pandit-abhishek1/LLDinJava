package JavaAndOOPs.j03inheritance.Basic;

public class Animals {
    String Name;
    int hasChildren;
    Animals(String Name, int hasChildren){
        this.Name = Name;
        this.hasChildren = hasChildren;
    }
    void eat(){
        System.out.println(Name + " is eating.");
    }
    void Children (){
        System.out.println("Animals have children");
    }
}
