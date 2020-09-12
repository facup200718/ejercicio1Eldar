package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public static int optionVerification(Scanner sc) {
        int option = 0;
        boolean isNumber = false;

        while (isNumber == false) {
            try {
                option = Integer.parseInt(sc.nextLine());
                isNumber = true;
            } catch(NumberFormatException e){
                System.out.println("Please write an integer number");
            }
        }



        return option;
    }


}
