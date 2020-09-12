package services;

import models.Brand;
import models.CreditCard;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static services.ValidateTransaction.transactionValidation;
import static utils.Utils.floatValidation;
import static utils.Utils.time;

public class TransactionInterestRate {
    public static void calculateInterestRate(Scanner sc) {
        System.out.println("Type in the transaction amount: \n");
        float amount = floatValidation(sc);

        if (transactionValidation(amount) == true) {
            System.out.println("Type in your brand\n");

            for (Brand brand:Brand.values()) {
                System.out.println(brand);
            }

            String answer = sc.next();
            String foundBrand = null;

            for (Brand brand:Brand.values()) {
                if (answer.equals(brand.toString())) {
                    foundBrand = brand.toString();
                    rates(foundBrand, amount);
                }
            }

            if (foundBrand == null) {
                System.out.println("Brand doesn't exist");
                System.out.println("You won't be able to validate interest rate of this transaction\n");
            }

        } else {
            System.out.println("You won't be able to validate interest rate of this transaction\n");
        }
    }

    public static void rates (String brand, float amount) {
        float ratePercentage = 0f;
        Date date = new Date();

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        float day = cal.get(Calendar.DAY_OF_MONTH);
        float month = cal.get(Calendar.MONTH);
        float year =  cal.get(Calendar.YEAR);

        switch (brand) {
            case "VISA":
                ratePercentage = rateLimits(Float.parseFloat(Float.toString(year).substring(2))/month);
                break;
            case "AMEX":
                ratePercentage = rateLimits(month * 0.1f);
                break;
            case "NARA":
                ratePercentage = rateLimits(day * 0.5f);
                break;
            default:
                break;
        }
        String str = String.format("%.02f", ratePercentage);
        System.out.println("The rate percentage is " + str + "%\n");
        amount = (amount / 100) * ratePercentage;
        str = String.format("%.02f", amount);
        System.out.println("The interest rate for the transaction is $" + str + "\n");

        time();
        time();

    }

    public static float rateLimits (float ratePercentage) {
        ratePercentage = ratePercentage > 5 ? 5 : ratePercentage;
        ratePercentage = ratePercentage < 0.3f ? 0.3f : ratePercentage;
        return ratePercentage;
    }
}
