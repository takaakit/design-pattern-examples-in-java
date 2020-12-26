package behavioralpatterns.iterator;
// ˅

// ˄

public class BookShelfIterator implements Iterator {
    // ˅
    
    // ˄

    private int index;

    private final BookShelf bookShelf;

    public BookShelfIterator(BookShelf bookShelf) {
        // ˅
        this.index = 0;
        this.bookShelf = bookShelf;
        
        // ˄
    }

    @Override
    public boolean hasNext() {
        // ˅
        return index < bookShelf.getNumberOfBooks();
        // ˄
    }

    @Override
    public Object next() {
        // ˅
        Book book = bookShelf.getAt(index);
        index++;
        return book;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
