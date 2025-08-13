package DesignPatterns.BehaviouralPattern.src.Strategy.GoodCode;

public class Paypal implements IPaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment.");
    }

}
