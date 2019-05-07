import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;
//    public HashMap<String, Integer>genres;




    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
//        this.genres = new HashMap<>();

    }

//    public static void main(String[] args) {
//        HashMap<String, Integer> genres = new HashMap<String, Integer>();
//    }

    public int getNumberOfBooks() {
        return books.size();
    }

    public void addBook(Book book) {
        if (hasCapacity()){
//            this.addBookGenre(book);
            this.books.add(book);
        }
    }

    public boolean hasCapacity() {
        return this.getNumberOfBooks() < this.capacity;
    }


    public Book removeBook() {
        return books.remove(0);
    }

//    public void addBookGenre(Book book){
//        genres.put(book.getGenre(), this.genres.get(book.getGenre()) + 1);
//    }
}
