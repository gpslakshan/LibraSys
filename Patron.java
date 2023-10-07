import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private int libraryCardNumber;
    private List<Book> borrowedBooks;

    public Patron(String name, int libraryCardNumber) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Method to borrow a book
    public void borrowBook(Book book) throws BookNotAvailableException {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false); // Mark the book as unavailable
        } else {
            throw new BookNotAvailableException("Sorry, the book '" + book.getTitle() + "' is not available for borrowing.");
        }
    }

    // Method to return a book
    public void returnBook(Book book) throws BookNotBorrowedException {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true); // Mark the book as available
        } else {
            throw new BookNotBorrowedException("You did not borrow the book '" + book.getTitle() + "'.");
        }
    }

    // Method to display the list of borrowed books
    public void displayBorrowedBooks() {
        System.out.println("Borrowed books by " + name + ":");
        for (Book book : borrowedBooks) {
            System.out.println("- " + book.getTitle());
        }
    }

    @Override
    public String toString() {
        return "Patron{" +
                "name='" + name + '\'' +
                ", libraryCardNumber=" + libraryCardNumber +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }

}
