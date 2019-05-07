import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowed;

    public Borrower(){
        this.borrowed = new ArrayList<>();
    }


    public int getBooksBorrowedNumber() {
        return borrowed.size();
    }

    public void addBookToBorrowerFromLibrary(Library library) {
        Book book = library.removeBook();
        borrowed.add(book);
    }
}

