import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(3);
        book = new Book("Python Crash Course", "Eric Matthes", "Educational");
    }

    @Test
    public void checkLibraryBookNumber(){
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void checkAddBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.getNumberOfBooks());
    }

    @Test
    public void checkLibraryCapacity(){;
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.getNumberOfBooks());
    }

    @Test
    public void checkBookRemovedLibrary(){
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.getNumberOfBooks());
    }
}
