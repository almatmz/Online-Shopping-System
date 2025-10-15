package myshop.Subsystems;

public class PaymentSystem {
    public void processPayment(String userEmail, double amount) {
        System.out.println("Processing payment of $" + amount + " for " + userEmail);
    }
}
