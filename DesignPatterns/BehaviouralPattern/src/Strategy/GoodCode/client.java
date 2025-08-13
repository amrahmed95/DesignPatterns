package DesignPatterns.BehaviouralPattern.src.Strategy.GoodCode;

public class client {
    public static void main(String[] args) {
        IPaymentStrategy creditCard = new CreditCard();
        PaymentService creditcardPayment = new PaymentService(creditCard);
        creditcardPayment.processPayment();

        IPaymentStrategy paypal = new Paypal();
        PaymentService paypalPayment = new PaymentService(paypal);
        paypalPayment.processPayment();

        IPaymentStrategy bankTransfer = new BankTransfer();
        PaymentService bankTransferPayment = new PaymentService(bankTransfer);
        bankTransferPayment.processPayment();
    }
}

/*
 * Output:
 * --------
 * Processing credit card payment.
 * Processing PayPal payment.
 * Processing bank transfer payment.
 */