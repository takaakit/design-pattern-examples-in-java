package creationalpatterns.abstractfactory;

import creationalpatterns.abstractfactory.factory.Data;
import creationalpatterns.abstractfactory.factory.Factory;
import creationalpatterns.abstractfactory.factory.Link;
import creationalpatterns.abstractfactory.factory.Page;

// Create a hierarchical link collection as an HTML file.

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Ex.1 : java Main creationalpatterns.abstractfactory.listfactory.ListFactory");
            System.out.println("Ex.2 : java Main creationalpatterns.abstractfactory.tablefactory.TableFactory");
        }
        else {
            Factory factory = null;
            try {
                factory = Factory.getFactory(args[0]);
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(-1);
            }

            Link washingtonPost = factory.createLink("The Washington Post", "https://www.washingtonpost.com/");
            Link newYorkTimes = factory.createLink("The NewYork Times", "https://www.nytimes.com/");
            Link financialTimes = factory.createLink("The Financial Times", "https://www.ft.com/");
            Link yahoo = factory.createLink("Yahoo!", "https://www.yahoo.com/");
            Link google = factory.createLink("Google", "https://www.google.com/");
            Link mlb = factory.createLink("MLB", "https://www.mlb.com/");
            Link fifa = factory.createLink("FIFA", "https://www.fifa.com/");
            Link wba = factory.createLink("WBA", "http://www.wbaboxing.com/");
            Link wbc = factory.createLink("WBC", "http://www.wbcboxing.com/");

            Data newspaper = factory.createData("Newspaper");
            newspaper.add(washingtonPost);
            newspaper.add(newYorkTimes);
            newspaper.add(financialTimes);

            Data searchEngine = factory.createData("Search engine");
            searchEngine.add(yahoo);
            searchEngine.add(google);

            Data sports = factory.createData("Sports");
            sports.add(mlb);
            sports.add(fifa);
            sports.add(wba);
            sports.add(wbc);

            Page linkPage = factory.createPage("LinkPage", "James Smith");
            linkPage.add(newspaper);
            linkPage.add(searchEngine);
            linkPage.add(sports);

            linkPage.output();
        }
    }
}
