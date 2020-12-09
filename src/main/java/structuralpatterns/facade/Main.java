package structuralpatterns.facade;

/*
Create a simple homepage through a Facade("PageCreator"). The Facade gets info from the "DataLibrary" and uses the info create an HTML file.
 */

public class Main {
    public static void main(String[] args) {
        PageCreator.createSimpleHomepage("emily@example.com", "Homepage.html");
    }
}
