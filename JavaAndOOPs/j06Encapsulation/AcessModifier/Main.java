package JavaAndOOPs.j06Encapsulation.AcessModifier;

public class Main {
    public static void main (String[] args){
        BankAccount myAccount = new BankAccount("123456789","Abhishek", 0);
        System.out.println("Current Balance: " + myAccount.getBalance());
        myAccount.deposit(500);
        System.out.println("Updated Balance: " + myAccount.getBalance());
    }
}

