package services;


import static utils.Utils.floatValidation;
import static utils.Utils.time;

public class ValidateTransaction {
    public static void validateTransaction() {
        System.out.println("Type in the transaction amount: \n");
        float amount = floatValidation();
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

        time();
        return result;
    }
}
