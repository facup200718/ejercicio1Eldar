package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public static long integerValidation(Scanner sc) {
        long integer = 0;
        boolean isNumber = false;

        while (!isNumber) {
            try {
                String lengthTest;
                do {
                    lengthTest = sc.nextLine(); //Con InputMismatchException loopeaba infinitamente
                    if (lengthTest.length() > 16) {
                        System.out.println("Please write a shorter value");
                    }
                } while(lengthTest.length() > 16);

                integer = Long.valueOf(lengthTest);
                isNumber = true;
            } catch(NumberFormatException e){
                System.out.println("Please write an integer number");
            }
        }

        return integer;
    }

    public static float floatValidation(Scanner sc) {
        float floatNumber = 0;
        boolean isNumber = false;
        while (!isNumber) {
            try {
                String lengthTest;
                do {
                    lengthTest = sc.nextLine(); //Con InputMismatchException loopeaba infinitamente
                    if (lengthTest.length() > 16) {
                        System.out.println("Please write a shorter value");
                    }
                } while(lengthTest.length() > 16);

                floatNumber = Float.valueOf(lengthTest);
                isNumber = true;
            } catch(NumberFormatException e) {
                System.out.println("Please write a number");
            }
        }

        return floatNumber;
    }


}
