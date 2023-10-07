import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to add a patron to the library
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    // Method to check if a specific book is available in the library
    public boolean isBookAvailable(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN) && book.isAvailable()) {
                return true;
            }
        }
        return false;
    }

    // Getter methods
    public List<Book> getBooks() {
        return books;
    }

    public List<Patron> getPatrons() {
        return patrons;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", patrons=" + patrons +
                '}';
    }
}
