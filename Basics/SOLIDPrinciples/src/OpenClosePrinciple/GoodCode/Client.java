package OpenClosePrinciple.GoodCode;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(new CreditCard(), 100);
        paymentProcessor.processPayment(new DebitCard(), 100);
        paymentProcessor.processPayment(new PayPal(), 100);
    }
}

/*
 * Output:
 * -------------
 * Processing Credit Card Payment of $100.0
 * Processing DebitCard Payment of $100.0
 * Processing PayPal Payment of $100.0
 */
