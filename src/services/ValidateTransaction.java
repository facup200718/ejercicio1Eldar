package services;

import java.util.Scanner;

public class ValidateTransaction {
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
