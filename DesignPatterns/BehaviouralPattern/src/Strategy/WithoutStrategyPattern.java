package DesignPatterns.BehaviouralPattern.src.Strategy;

class PaymentService {
    public void processPayment(String paymentType) {
        if (paymentType.equals("CreditCard")) {
            System.out.println("Processing credit card payment.");
        } else if (paymentType.equals("PayPal")) {
            System.out.println("Processing PayPal payment.");
        } else if (paymentType.equals("BankTransfer")) {
            System.out.println("Processing bank transfer payment.");
        } else {
            System.out.println("Unknown payment type.");
        }
    }
}

public class WithoutStrategyPattern {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        // Processing different types of payments
        paymentService.processPayment("CreditCard");
        paymentService.processPayment("PayPal");
        paymentService.processPayment("BankTransfer");
        paymentService.processPayment("Bitcoin"); // Unknown type
    }
}


/*
 * Output:
 * -------------
 * Processing credit card payment.
 * Processing PayPal payment.
 * Processing bank transfer payment.
 * Unknown payment type.
 */



 /*
  * Problems:
  * 1. The PaymentService class is tightly coupled with the payment types.
  * 2. The PaymentService class has multiple responsibilities (deciding the payment type and processing the payment), violating the Single Responsibility Principle.
  * 3. Adding a new payment type requires modifying the PaymentService class, which violates the Open/Closed Principle.
  */



  /*
   * With Strategy Pattern,
   * the logic for each payment type is encapsulated in separate strategy classes,
   * and the paymentService (context class) delegates the task of payment processing
   * to one of these strategies at runtime.
   */