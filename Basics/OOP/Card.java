package Basics.OOP;
abstract public class Card implements IPaymentMethod {
    private String cardNo;
    private String cardHolderName;

    public Card(String cardNo, String cardHolderName) {
        this.cardNo = cardNo;
        this.cardHolderName = cardHolderName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }
}
