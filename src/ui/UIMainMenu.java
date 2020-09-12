package ui;

import models.CreditCard;

import java.util.ArrayList;
import java.util.Scanner;

import static services.CompareCards.compareCards;
import static services.ShowCard.showCreditCardInfo;
import static services.ValidateTransaction.validateTransaction;
import static services.ValidateCard.validateCard;

public class UIMainMenu {
    public static void showMainMenu(ArrayList<CreditCard> creditCardList) {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("1) Show credit card info");
            System.out.println("2) Validate transaction");
            System.out.println("3) Validate card");
            System.out.println("4) Compare cards");
            System.out.println("5) Exit \n");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    showCreditCardInfo(sc, creditCardList);
                    break;
                case 2:
                    validateTransaction(sc);
                    break;
                case 3:
                    validateCard(sc, creditCardList);
                    break;
                case 4:
                    compareCards(sc, creditCardList);
                    break;
                case 5:
                    break;
            }
        } while(option >= 1 && option <= 4);
    }
}
