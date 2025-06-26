package JavaAndOOPs.j06Encapsulation.AcessModifier;

public class BankAccount {
    private String AcountNumber;
    private String AccountHolderName;
    private double Balance;
    // Cunstructor
  public  BankAccount (String accountNumber, String accountHolderName, double initialBalance) {
        this.AcountNumber = accountNumber;
        this.AccountHolderName = accountHolderName;
        this.Balance = initialBalance;
    }
   public double getBalance(){
         return Balance;
   }
   public void deposit(double amount){
     if(amount> 0){
        Balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
     }
   }
}
