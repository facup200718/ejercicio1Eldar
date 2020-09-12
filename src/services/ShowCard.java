package services;

import models.CreditCard;

import java.util.ArrayList;

import static utils.Utils.leadingZeros;
import static utils.Utils.time;

public class ShowCard {
    public static void showCreditCardInfo(ArrayList<CreditCard> creditCardList) {
        CreditCard foundCreditCard = null;

        System.out.println("Write your credit card number: \n");
        String number;

        do {
            number = leadingZeros();

            if (number.length() != 16) {
                System.out.println("Your credit card number must be 16 digits long");
            }
        } while (number.length() != 16);

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

        }
        time();
    }
}
