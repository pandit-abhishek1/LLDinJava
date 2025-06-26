package JavaAndOOPs.interfaces.PaymentSystem;

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}
public class PaymentMethod {
    CreditCardPayment creditCardPayment = new CreditCardPayment();
    PayPalPayment payPalPayment = new PayPalPayment();
    public void MakePayment(String type, int amount){
        if(type.equals("CreditCard")){
            creditCardPayment.pay(amount);
        } else if(type.equals("PayPal")){
            payPalPayment.pay(amount);
        }
    }
}
