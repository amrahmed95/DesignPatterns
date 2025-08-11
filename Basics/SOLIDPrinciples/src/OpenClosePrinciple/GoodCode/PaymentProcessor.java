package OpenClosePrinciple.GoodCode;

public class PaymentProcessor {

    public void processPayment(IPaymentMethod paymentMethod, double amount) {
        paymentMethod.Pay(amount);  // Runtime Polymorphism
    }
}