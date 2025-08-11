package Basics.OOP;

public class CreditCard extends Card{
    public CreditCard(String cardNo, String cardHolderName) {
        super(cardNo, cardHolderName);
    }

    @Override
    public void pay() {
        System.out.println("Paying with Credit Card "+ getCardNo() + " for " + getCardHolderName());
    }

}
