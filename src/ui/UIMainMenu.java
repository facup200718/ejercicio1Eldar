package ui;

import models.CreditCard;

import java.util.ArrayList;
import java.util.Scanner;

import static ui.UIShowCard.showCreditCardInfo;
import static ui.UIValidateTransaction.validateTransaction;
import static ui.UIValidateCard.validateCard;

public class UIMainMenu {
    public static void showMainMenu(ArrayList<CreditCard> creditCardList) {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("1) Show credit card info");
            System.out.println("2) Validate Transaction");
            System.out.println("3) Validate Card");
            System.out.println("4) Exit");
            System.out.println();

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
                    break;
            }
        } while(option != 4);
    }
}
