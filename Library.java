import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Patron> patrons;

    public void addBook(Book book){
        books.add(book);
    }

    public void addPatron(Patron patron){
        patrons.add(patron);
    }

    public boolean checkBookAvailability(Book book){
        return false;
    }
}
