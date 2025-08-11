package Basics.OOP;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.addPaymentMethod("CreditCard", new CreditCard("1234", "John Doe"));
        paymentService.addPaymentMethod("DebitCard", new DebitCard("1234", "John Doe"));
        paymentService.addPaymentMethod("UPI", new UPI("1234"));

        paymentService.makePayment("CreditCard");
        paymentService.makePayment("DebitCard");
        paymentService.makePayment("UPI");
    }
}

/*
 * Paying with Credit Card 1234 for John Doe
 * Debit card payment. Card no: 1234 for John Doe
 * Paying with UPL 1234
 */


