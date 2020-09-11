package models;

public class CreditCard {
    public enum Brand{
        VISA,AMEX,NARA
    };
    private Brand brand;
    private double cardNumber;
    private String cardHolder;
    private ExpirationDate expirationDate;

    public CreditCard(Brand brand, double cardNumber, String cardHolder, ExpirationDate expirationDate) {
        this.brand = brand;
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expirationDate = expirationDate;
    }

    public Brand getBrand() {
        return brand;
    }

    public double getCardNumber() {
        return cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }
}
