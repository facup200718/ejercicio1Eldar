package ui;

import models.CreditCard;

import java.util.Scanner;

public class UIShowCard {
    public static void showCreditCardInfo(Scanner sc, CreditCard[] creditCard) {
        boolean bandera = false;
        CreditCard foundCreditCard = null;

        System.out.println("Write your credit card number: ");
        String number = sc.next();

        for (int i = 0; i < creditCard.length; i++) {
            if (number.equals(creditCard[i].getCardNumber())) {
                bandera = true;
                foundCreditCard = creditCard[i];
            }
        }

        if (bandera == false) {
            System.out.println("Wrong card number");
        } else {
            System.out.println(foundCreditCard.getBrand());
            System.out.println(foundCreditCard.getCardNumber());
            System.out.println(foundCreditCard.getCardHolder());
            System.out.println(foundCreditCard.getExpirationDate().getMonth() + "/" + foundCreditCard.getExpirationDate().getYear());
        }
    }
}
