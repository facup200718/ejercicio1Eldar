package ui;

import models.CreditCard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UIValidateCard {
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
            System.out.println("Wrong card number");
            System.out.println();
        } else {
            System.out.println("Card found");
            System.out.println();
            LocalDate todayDate = LocalDate.now();

            if (todayDate.isBefore(foundCreditCard.getExpirationDate())) {
                System.out.println("Valid card");
                System.out.println();
            } else if (todayDate.isAfter(foundCreditCard.getExpirationDate()) || todayDate.isEqual(foundCreditCard.getExpirationDate())) {
                System.out.println("Your card has expired");
                System.out.println();
            }
        }
    }
}
