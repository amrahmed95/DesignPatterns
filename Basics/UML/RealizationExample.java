package Basics.UML;

interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " with Credit Card");
    }
}

public class RealizationExample {
    public static void main(String[] args) {
        Payment payment = new CreditCard();
        payment.pay(100.0);
    }
}

// Output:
// Paying $100.0 with Credit Card
