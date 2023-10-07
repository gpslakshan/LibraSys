public class LibrarySystem {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Create some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Create some patrons
        Patron patron1 = new Patron("Alice", 1001);
        Patron patron2 = new Patron("Bob", 1002);

        // Add patrons to the library
        library.addPatron(patron1);
        library.addPatron(patron2);

       // Demonstrate book borrowing and returning (Also Exception Handling using custom exceptions)
        try {
            patron1.borrowBook(book1);
            patron2.borrowBook(book2);
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        patron1.displayBorrowedBooks();
        patron2.displayBorrowedBooks();

        try {
            patron1.returnBook(book1);
            patron2.returnBook(book2);
        } catch (BookNotBorrowedException e){
            System.out.println(e.getMessage());
        }

        patron1.displayBorrowedBooks();
        patron2.displayBorrowedBooks();

        // Check if a book is available in the library
        String ISBNToCheck = "978-0743273565";
        if (library.isBookAvailable(ISBNToCheck)) {
            System.out.println("The book with ISBN " + ISBNToCheck + " is available in the library.");
        } else {
            System.out.println("The book with ISBN " + ISBNToCheck + " is not available in the library.");
        }
    }
}