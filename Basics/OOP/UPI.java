package Basics.OOP;

public class UPI implements IPaymentMethod {
    String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("Paying with UPL " + upiId);
    }
}
