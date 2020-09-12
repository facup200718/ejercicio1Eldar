package services;

import models.CreditCard;

import java.util.ArrayList;
import java.util.Scanner;

public class UICompareCards {
    public static void compareCards(Scanner sc, ArrayList<CreditCard> creditCardList) {
        int i = 0;
        System.out.println("List of cards: \n");

        ArrayList<CreditCard> temporalList = new ArrayList<>(creditCardList);

        CreditCard a = null;
        CreditCard b = null;

        for (CreditCard c : temporalList) {
            i++;
            System.out.println(i + ") XXXX XXXX XXXX " + c.getCardNumber().substring(c.getCardNumber().length() - 4));
        }

        System.out.println("\nSelect a card (Type in 1, 2, 3...)\n");

        int answer = sc.nextInt();
        a = temporalList.get(answer-1);
        temporalList.remove(answer-1);

        i = 0;

        for (CreditCard c : temporalList) {
            i++;
            System.out.println(i + ") XXXX XXXX XXXX " + c.getCardNumber().substring(c.getCardNumber().length() - 4));
        }

        System.out.println("\nSelect another card\n");

        answer = sc.nextInt();
        b = temporalList.get(answer-1);
        temporalList.remove(answer-1);

        if (!a.getCardNumber().equals(b.getCardNumber())) {
            System.out.println("Cards are different\n");
        } else {
            System.out.println("Cards are the same, maybe it has been cloned\n");
        }
    }
}
