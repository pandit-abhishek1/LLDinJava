package JavaAndOOPs.j06Encapsulation.DataHiding;

public class Account {
     private double balance;
     public Account (double initialBalance){
        if (initialBalance >0){
            this.balance = initialBalance;
        }else {
            System.out.println("Initial balance must be positive.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
     private boolean validateWithdrawal(double amount) {
        return amount > 0 && amount <= balance;
    }

    public void withdraw(double amount) {
        if (validateWithdrawal(amount)) {
            balance -= amount;
            System.out.println("Withdrawal Successful: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}
