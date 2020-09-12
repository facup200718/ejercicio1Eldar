package ui;

import models.CreditCard;

import java.util.ArrayList;
import java.util.Scanner;

public class UICompareCards {
    public static void compareCards(Scanner sc, ArrayList<CreditCard> creditCardList) {
        int i = 0;
        System.out.println("List of cards: ");

        ArrayList<CreditCard> temporalList = new ArrayList<>();
        temporalList = creditCardList;
        CreditCard a = null;
        CreditCard b = null;

        for (CreditCard c : temporalList) {
            i++;
            System.out.println(i + ") XXXX XXXX XXXX " + c.getCardNumber().substring(c.getCardNumber().length() - 4));
        }

        System.out.println();
        System.out.println("Select a card (Type in 1, 2, 3...)");

        int answer = sc.nextInt();
        a = temporalList.get(answer-1);

        for (CreditCard c : temporalList) {
            i++;
            if (i == answer) {
                temporalList.remove(c);
            }
        }

        i = 0;

        for (CreditCard c : temporalList) {
            i++;
            System.out.println(i + ") XXXX XXXX XXXX " + c.getCardNumber().substring(c.getCardNumber().length() - 4));
        }

        System.out.println("Select another card");
    }
}
