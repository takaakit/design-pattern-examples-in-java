package structuralpatterns.facade;

/*
Create a simple homepage through a Facade (PageCreator). The Facade gets info from
the DataLibrary and uses the info to create an HTML file.
 */

public class Main {
    public static void main(String[] args) {
        PageCreator.getInstance().createSimpleHomepage("emily@example.com", "Homepage.html");
    }
}
