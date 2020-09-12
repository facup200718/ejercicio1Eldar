package services;

import models.CreditCard;

import java.util.ArrayList;
import java.util.Scanner;

public class UIValidateTransaction {
    public static void validateTransaction(Scanner sc) {
        System.out.println("Type in the transaction amount: \n");
        float monto = sc.nextFloat();

        if (monto > 0 && monto < 1000) {
            System.out.println("\nValid transaction\n");
        } else {
            System.out.println("Invalid transaction\n");
        }
    }
}
