package ui;

import models.CreditCard;

import java.util.ArrayList;
import java.util.Scanner;

import static ui.UIShowCard.showCreditCardInfo;

public class UIMainMenu {
    public static void showMainMenu(ArrayList<CreditCard> creditCardList) {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("1) Show credit card info");
            System.out.println("2) Exit");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    showCreditCardInfo(sc, creditCardList);
                    break;
                case 2:
                    break;
            }
        } while(option != 2);
    }
}
