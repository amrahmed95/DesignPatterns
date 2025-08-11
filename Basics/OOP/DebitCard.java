package Basics.OOP;

public class DebitCard extends Card{
    public DebitCard(String cardNo, String cardHolderName) {
        super(cardNo, cardHolderName);
    }

    @Override
    public void pay(){
        System.out.println("Debit card payment. Card no: " + getCardNo() + " for " + getCardHolderName());
    }

}
