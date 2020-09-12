package services;

import models.CreditCard;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static utils.Utils.integerValidation;

public class ValidateCard {
    public static void validateCard(Scanner sc, ArrayList<CreditCard> creditCardList) {
        CreditCard foundCreditCard = null;

        System.out.println("Write your credit card number: ");
        String number;

        do {
            number = String.valueOf(integerValidation(sc));
            System.out.println(number);

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
