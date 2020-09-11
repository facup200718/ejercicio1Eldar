package ui;

import models.CreditCard;

import java.util.ArrayList;
import java.util.Scanner;

public class UIValidateTransaction {
    public static void validateTransaction(Scanner sc) {
        System.out.println("Type in the transaction amount: ");
        float monto = sc.nextFloat();

        if (monto >= 1000 || monto < 0) {
            System.out.println("Invalid transaction");
            System.out.println();
        } else if (monto > 0 && monto < 1000) {
            System.out.println("Valid transaction");
            System.out.println();
        }
    }
}
