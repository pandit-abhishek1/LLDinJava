package JavaAndOOPs.j06Encapsulation.DataHiding;

public class Main {
    public static void main (String []args){
        Account myAccount = new Account(100);
        System.out.println("Initial Balance: " + myAccount.getBalance());
        myAccount.deposit(50);
        System.out.println("Balance after deposit: " + myAccount.getBalance());
        myAccount.withdraw(30);
        System.out.println("Balance after withdrawal: " + myAccount.getBalance());
    }
}
