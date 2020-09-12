package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public static long integerValidation() {
        Scanner sc = new Scanner(System.in);
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

    public static float floatValidation() {
        Scanner sc = new Scanner(System.in);
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

    public static String leadingZeros () {
        Scanner sc = new Scanner(System.in);
        String number = null;
        boolean isNumber = false;

        while (!isNumber) {
            try {
                number = sc.next();
                Long lNumber = Long.valueOf(number); //Si ingresamos algo que no es un entero salta al catch
                isNumber = true;
            } catch (Exception e) {
                System.out.println("Please write a number");
            }
        }
        return number;
    }

    public static void time() {
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
