package models;

import java.util.Date;

public class Card {
    public enum Brand{
        VISA,AMEX,NARA
    };
    private Brand brand;
    private double cardNumber;
    private String cardHolder;
    private ExpirationDate expirationDate;

    public Card(Brand brand, double cardNumber, String cardHolder, ExpirationDate expirationDate) {
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

