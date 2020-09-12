import models.CreditCard;
import models.Brand;

import java.util.ArrayList;

import static ui.UIMainMenu.showMainMenu;

public class Main {

    public static void main(String[] args) {
        ArrayList<CreditCard> creditCardList = new ArrayList<>();
        CreditCard creditCard;

        creditCard = new CreditCard(Brand.VISA,"0048474635535001", "Roberto Alvarez","07/11/2023");
        creditCardList.add(creditCard);
        creditCard = new CreditCard(Brand.AMEX,"8889348784564422","Abril Perez", "04/08/2020");
        creditCardList.add(creditCard);
        creditCard = new CreditCard(Brand.NARA,"0048474635535001","Eduardo Gimenez", "06/02/2028");
        creditCardList.add(creditCard);

        showMainMenu(creditCardList);
    }


}
