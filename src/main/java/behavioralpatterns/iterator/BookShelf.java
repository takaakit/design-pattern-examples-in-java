package behavioralpatterns.iterator;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class BookShelf implements Aggregate {
    // ˅
    
    // ˄

    int numberOfBooks;

    private final List<Book> books;

    public BookShelf(int maxsize) {
        // ˅
        this.numberOfBooks = 0;
        this.books = new ArrayList<>(Arrays.asList(new Book[maxsize]));
        
        // ˄
    }

    @Override
    public Iterator iterator() {
        // ˅
        return new BookShelfIterator(this);
        // ˄
    }

    Book getAt(int index) {
        // ˅
        return books.get(index);
        // ˄
    }

    public void add(Book book) {
        // ˅
        books.set(numberOfBooks, book);
        numberOfBooks++;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
