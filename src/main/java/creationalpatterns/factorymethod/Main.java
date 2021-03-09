package creationalpatterns.factorymethod;

import creationalpatterns.factorymethod.framework.Factory;
import creationalpatterns.factorymethod.framework.Product;
import creationalpatterns.factorymethod.creditcard.CreditCardFactory;

/*
The subject is a factory to make credit cards. The Factory defines how to create an credit card,
but the actual credit card is created by the CreditCardFactory.
The "createProduct()" is called a Factory Method, and it is responsible for manufacturing an object.
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
