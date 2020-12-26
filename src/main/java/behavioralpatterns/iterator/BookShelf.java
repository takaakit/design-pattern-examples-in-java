package behavioralpatterns.iterator;
// ˅
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ˄

public class BookShelf implements Aggregate {
    // ˅
    
    // ˄

    private int numberOfBooks;

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

    public Book getAt(int index) {
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

    public int getNumberOfBooks() {
        // ˅
        return numberOfBooks;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
