package OpenClosePrinciple.GoodCode;

public class PayPal implements IPaymentMethod {

    @Override
    public void Pay(double amount) {
        // Some Business Logic
        System.out.println("Processing PayPal Payment of $" + amount);
    }

}