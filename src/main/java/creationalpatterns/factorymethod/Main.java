package creationalpatterns.factorymethod;

import creationalpatterns.factorymethod.framework.Factory;
import creationalpatterns.factorymethod.framework.Product;
import creationalpatterns.factorymethod.idcard.CreditCardFactory;

/*
Create documents in HTML format and text format. It is possible to create different documents in the same construction process.
 */

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
