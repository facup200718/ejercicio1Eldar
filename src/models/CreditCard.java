package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CreditCard {
    public enum Brand{
        VISA,AMEX,NARA
    }

    private Brand brand;
    private String cardNumber;
    private String cardHolder;
    private LocalDate expirationDate;

    public CreditCard(Brand brand, String cardNumber, String cardHolder, String expirationDate) {
        this.brand = brand;
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = expirationDate;
        this.expirationDate = LocalDate.parse(date, formatter);
    }

    public Brand getBrand() {
        return brand;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

}
