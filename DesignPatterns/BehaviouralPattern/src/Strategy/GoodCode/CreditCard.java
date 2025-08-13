package DesignPatterns.BehaviouralPattern.src.Strategy.GoodCode;

public class CreditCard implements IPaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment.");
    }

}
