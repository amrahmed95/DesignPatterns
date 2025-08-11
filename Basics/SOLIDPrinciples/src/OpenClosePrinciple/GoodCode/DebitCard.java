package OpenClosePrinciple.GoodCode;

public class DebitCard implements IPaymentMethod {

    @Override
    public void Pay(double amount) {
        // Some Business Logic
        System.out.println("Processing DebitCard Payment of $" + amount);
    }

}
