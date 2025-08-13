package DesignPatterns.BehaviouralPattern.src.Strategy.GoodCode;

public class PaymentService {
    private IPaymentStrategy strategy;

    public PaymentService(IPaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment() {
        strategy.processPayment(); // Runtime polymorphism
    }
}
