package creationalpatterns.abstractfactory;

import creationalpatterns.abstractfactory.factory.Data;
import creationalpatterns.abstractfactory.factory.Factory;
import creationalpatterns.abstractfactory.factory.Link;
import creationalpatterns.abstractfactory.factory.Page;
import creationalpatterns.abstractfactory.listfactory.ListFactory;
import creationalpatterns.abstractfactory.tablefactory.TableFactory;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Create a hierarchical link collection as an HTML file. It can be created in either tabular or list format.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number (1 or 2):");
        System.out.println("  1: Create objects by using ListFactory");
        System.out.println("  2: Create objects by using TableFactory");
        Scanner scan = new Scanner(System.in);
        int number = 0;
        try {
            number = scan.nextInt();
        }
        catch (InputMismatchException e) {
            System.err.println("Unexpected value.");
            System.exit(-1);
        }

        Factory factory = null;
        if (number == 1) {
            factory = new ListFactory();
        }
        else if (number == 2) {
            factory = new TableFactory();
        }
        else {
            System.err.println("The value is not 1 or 2.");
            System.exit(-1);
        }

        Link washingtonPost = factory.createLink("The Washington Post", "https://www.washingtonpost.com/");
        Link newYorkTimes = factory.createLink("The NewYork Times", "https://www.nytimes.com/");
        Link financialTimes = factory.createLink("The Financial Times", "https://www.ft.com/");

        Data newspaper = factory.createData("Newspaper");
        newspaper.add(washingtonPost);
        newspaper.add(newYorkTimes);
        newspaper.add(financialTimes);

        Link yahoo = factory.createLink("Yahoo!", "https://www.yahoo.com/");
        Link google = factory.createLink("Google", "https://www.google.com/");

        Data searchEngine = factory.createData("Search engine");
        searchEngine.add(yahoo);
        searchEngine.add(google);

        Page linkPage = factory.createPage("LinkPage", "James Smith");
        linkPage.add(newspaper);
        linkPage.add(searchEngine);

        linkPage.output();
    }
}
