package OpenClosePrinciple.GoodCode;

public class CreditCard implements IPaymentMethod {

    @Override
    public void Pay(double amount) {
        // Some Business Logic
        System.out.println("Processing Credit Card Payment of $" + amount);
    }

}
