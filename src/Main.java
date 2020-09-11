import models.CreditCard;
import models.ExpirationDate;

import java.util.Scanner;

import static ui.UIShowCard.showCreditCardInfo;

public class Main {

    public static void main(String[] args) {
        CreditCard creditCard[] = new CreditCard[3];
        creditCard[0] = new CreditCard(CreditCard.Brand.VISA,"4124-9888-7644-0110", "Roberto Alvarez", new ExpirationDate("04","2022"));
        creditCard[1] = new CreditCard(CreditCard.Brand.AMEX,"8889-3487-8456-4422","Abril Perez", new ExpirationDate("06","2023"));
        creditCard[2] = new CreditCard(CreditCard.Brand.NARA,"0048-4746-3553-5001","Eduardo Gimenez", new ExpirationDate("11","2028"));
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("1) Show credit card info");
            System.out.println("2) Exit");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    showCreditCardInfo(sc, creditCard);
                    break;
                case 2:
                    break;
            }
        } while(option != 2);
    }


}
