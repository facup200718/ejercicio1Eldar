package services;

import models.CreditCard;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static utils.Utils.leadingZeros;
import static utils.Utils.time;

public class ValidateCard {
    public static void validateCard(Scanner sc, ArrayList<CreditCard> creditCardList) {
        CreditCard foundCreditCard = null;

        System.out.println("Write your credit card number: ");
        String number;

        do {
            number = leadingZeros(sc);

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
            System.out.println("\nCard found");
            LocalDate todayDate = LocalDate.now();

            if (todayDate.isBefore(foundCreditCard.getExpirationDate())) {
                System.out.println("Valid card\n");
            } else {
                System.out.println("Your card has expired\n");
            }
        }
        time();
    }
}
