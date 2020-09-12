package services;

import models.CreditCard;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ValidateCard {
    public static void validateCard(Scanner sc, ArrayList<CreditCard> creditCardList) {
        CreditCard foundCreditCard = null;

        System.out.println("Write your credit card number: ");
        String number = sc.next();

        for (CreditCard c : creditCardList) {
            if (c.getCardNumber().equals(number)) {
                foundCreditCard = c;
            }
        }

        if (foundCreditCard == null) {
            System.out.println("Wrong card number\n");
        } else {
            System.out.println("Card found\n");
            LocalDate todayDate = LocalDate.now();

            if (todayDate.isBefore(foundCreditCard.getExpirationDate())) {
                System.out.println("Valid card\n");
            } else {
                System.out.println("Your card has expired\n");
            }
        }
    }
}
