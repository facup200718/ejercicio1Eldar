import models.CreditCard;
import models.ExpirationDate;

import static ui.UIMainMenu.showMainMenu;

public class Main {

    public static void main(String[] args) {
        CreditCard creditCard[] = new CreditCard[3];
        creditCard[0] = new CreditCard(CreditCard.Brand.VISA,"4124-9888-7644-0110", "Roberto Alvarez", new ExpirationDate("04","2022"));
        creditCard[1] = new CreditCard(CreditCard.Brand.AMEX,"8889-3487-8456-4422","Abril Perez", new ExpirationDate("06","2023"));
        creditCard[2] = new CreditCard(CreditCard.Brand.NARA,"0048-4746-3553-5001","Eduardo Gimenez", new ExpirationDate("11","2028"));

        showMainMenu(creditCard);
    }


}
