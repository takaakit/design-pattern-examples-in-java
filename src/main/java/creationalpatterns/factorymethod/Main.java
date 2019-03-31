package creationalpatterns.factorymethod;

import creationalpatterns.factorymethod.framework.Factory;
import creationalpatterns.factorymethod.framework.Product;
import creationalpatterns.factorymethod.idcard.CreditCardFactory;

// Factory to make ID cards.

public class Main {
    public static void main(String[] args) {
        Factory factory = new CreditCardFactory();

        Product jacksonCard = factory.create("Jackson");
        jacksonCard.use();

        Product sophiaCard = factory.create("Sophia");
        sophiaCard.use();

        Product oliviaCard = factory.create("Olivia");
        oliviaCard.use();
    }
}
