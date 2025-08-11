package SingleResponsibilityPrinciple.BadCode;

public class Invoice {

    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public void generateInvoice() {
        System.out.println("Generating invoice for amount: " + amount);
    }

    public void sendToDatabase() {
        System.out.println("Sending invoice to database");
    }

    public void sendEmailNotification() {
        System.out.println("Sending email notification");
    }
}
