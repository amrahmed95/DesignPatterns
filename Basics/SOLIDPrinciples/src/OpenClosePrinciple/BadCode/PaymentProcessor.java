package OpenClosePrinciple.BadCode;

public class PaymentProcessor {

    public void processPayment(String paymentMethod, double amount) {
        if (paymentMethod.equals("CreditCard")) {
            // Some Business Logic
            System.out.println("Processing Credit Card Payment of $" + amount);
        } else if (paymentMethod.equals("DebitCard")) {
            // Some Business Logic
            System.out.println("Processing DebitCard Payment of $" + amount);
        } else if (paymentMethod.equals("PayPal")) {
            // Some Business Logic
            System.out.println("Processing PayPal Payment of $" + amount);
        } else {
            throw new IllegalArgumentException("Invalid payment method: " + paymentMethod);
        }
    }
}

/*
 * Problem:
 * -------------
 * The PaymentProcessor class should be open for extension but closed for modification.
 * If we want to add a new payment method (ex: UPI ), or modify an existing one (ex: CreditCard ),
 * we need to modify the existing code of processPayment method which is already tested and working.
 */
