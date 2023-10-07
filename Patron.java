import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private int libraryCardNumber;
    private ArrayList<Book> borrowedBooks;

    public void borrowBook(String ISBN){

    }

    public void returnBook(String ISBN){

    }

    public void displayAllBorrowedBooks(){
        System.out.println("All the borrowed books : " + borrowedBooks);
    }
}
