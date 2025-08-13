package DesignPatterns.BehaviouralPattern.src.Strategy.GoodCode;

public class BankTransfer implements IPaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing bank transfer payment.");
    }

}
