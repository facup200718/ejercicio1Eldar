package services;

import models.CreditCard;

import java.util.ArrayList;
import java.util.Scanner;

import static utils.Utils.integerValidation;
import static utils.Utils.time;

public class CompareCards {
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

        int answer;

        do {
            answer = (int) (integerValidation(sc));
            if (answer < 1 || answer > temporalList.size()) {
                System.out.println("Please select an existing option");
            }
        } while (answer < 1 || answer > temporalList.size());

        a = temporalList.get(answer-1);
        temporalList.remove(answer-1);

        time();

        i = 0;

        for (CreditCard c : temporalList) {
            i++;
            System.out.println(i + ") XXXX XXXX XXXX " + c.getCardNumber().substring(c.getCardNumber().length() - 4));
        }

        System.out.println("\nSelect another card\n");

        do {
            answer = (int) (integerValidation(sc));
            if (answer < 1 || answer > temporalList.size()) {
                System.out.println("Please select an existing option");
            }
        } while (answer < 1 || answer > temporalList.size());

        b = temporalList.get(answer-1);
        temporalList.remove(answer-1);

        if (!a.getCardNumber().equals(b.getCardNumber())) {
            System.out.println("Cards are different\n");
        } else {
            System.out.println("Cards are the same, maybe one has been cloned\n");
        }

        time();
    }
}