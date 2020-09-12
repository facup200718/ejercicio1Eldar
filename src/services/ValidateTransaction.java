package services;

import java.util.Scanner;

public class ValidateTransaction {
    public static void validateTransaction(Scanner sc) {
        System.out.println("Type in the transaction amount: \n");
        float amount = sc.nextFloat();
        transactionValidation(amount);
    }

    public static boolean transactionValidation (float amount) {
        boolean result;
        if (amount > 0 && amount < 1000) {
            System.out.println("\nValid transaction\n");
            result = true;
        } else {
            System.out.println("Invalid transaction\n");
            result = false;
        }
        return result;
    }
}
