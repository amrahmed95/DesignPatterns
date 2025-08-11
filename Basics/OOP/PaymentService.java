package Basics.OOP;

import java.util.HashMap;

public class PaymentService {

    HashMap<String, IPaymentMethod> paymentMethods;

    PaymentService(){
        paymentMethods = new HashMap<>();
    }

    public void addPaymentMethod(String name, IPaymentMethod pm){
        paymentMethods.put(name, pm);
    }

    public void makePayment(String name){
        IPaymentMethod paymentMethod = paymentMethods.get(name);
        paymentMethod.pay();
        // Run-time Polymorphism, actual pay() method called depends on
        // the runtime type of the object stored in paymentMethods
        // ------------ EXAMPLE ------------
        // --> CreditCard.pay()
        // --> DebitCard.pay()
        // --> UPI.pay()
    }

}
