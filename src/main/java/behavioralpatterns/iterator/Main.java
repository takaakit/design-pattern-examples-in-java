package behavioralpatterns.iterator;

/*
Add books in a bookshelf and display the names of the book in turn.
 */

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.add(new Book("Design Patterns: Elements of Reusable Object-Oriented Software"));
        bookShelf.add(new Book("The Object Primer: Agile Model-Driven Development with UML 2.0"));
        bookShelf.add(new Book("Software Systems Architecture: Working With Stakeholders Using Viewpoints and Perspectives"));
        bookShelf.add(new Book("A Practical Guide to SysML: The Systems Modeling Language"));
        bookShelf.add(new Book("A Pattern Language: Towns, Buildings, Construction"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.title);
        }
    }
}
