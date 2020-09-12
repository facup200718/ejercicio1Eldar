package services;

import models.CreditCard;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowCard {
    public static void showCreditCardInfo(Scanner sc, ArrayList<CreditCard> creditCardList) {

        CreditCard foundCreditCard = null;

        System.out.println("Write your credit card number: \n");
        String number = sc.next();

        for (CreditCard c : creditCardList) {
            if (c.getCardNumber().equals(number)) {
                foundCreditCard = c;
            }
        }

        if (foundCreditCard == null) {
            System.out.println("\nWrong card number\n");
        } else {
            System.out.println("Brand: " + foundCreditCard.getBrand());
            System.out.println("Card number: " + number);
            System.out.println("Card holder: " + foundCreditCard.getCardHolder());
            System.out.println("Date of expiration: " + foundCreditCard.getExpirationDate().getMonth() + "/"
                    + foundCreditCard.getExpirationDate().getYear() + "\n");
            System.out.println();
        }
    }
}
