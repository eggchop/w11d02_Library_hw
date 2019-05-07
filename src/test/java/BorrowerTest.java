import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;


    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("Python Crash Course", "Eric Matthes", "Educational");
        library = new Library(3);
        library.addBook(book);

    }

    @Test
    public void checkNumberBooksBorrowed(){
        assertEquals(0, borrower.getBooksBorrowedNumber());
    }

    @Test
    public void checkBookAddedToBorrower(){
        borrower.addBookToBorrowerFromLibrary(library);
        assertEquals(1, borrower.getBooksBorrowedNumber());
        assertEquals(0, library.getNumberOfBooks());
    }
}
