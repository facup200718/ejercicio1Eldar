import models.CreditCard;
import models.ExpirationDate;

public class Main {

    public static void main(String[] args) {
        CreditCard tarjeta1 = new CreditCard(CreditCard.Brand.VISA,4124-9888-7644-0110, "Alberto Direnna", new ExpirationDate(04,2022));
        System.out.println(tarjeta1.getBrand());
        System.out.println(tarjeta1.getCardNumber());
        System.out.println(tarjeta1.getCardHolder());
        System.out.println(tarjeta1.getExpirationDate().getMonth() + "/" + tarjeta1.getExpirationDate().getYear());
    }
}
