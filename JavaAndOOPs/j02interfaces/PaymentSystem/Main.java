package JavaAndOOPs.j02interfaces.PaymentSystem;

public class Main {
    public static void main(String[] args) {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.MakePayment("CreditCard", 100);
        paymentMethod.MakePayment("PayPal", 200);
    }
}
