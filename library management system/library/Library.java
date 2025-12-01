 package library;
 import java.util.ArrayList;
 public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
        System.out.println(" Book added successfully.");
    }
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println(" No books in the library.");
        } else {
            for (Book b : books) {
                 System.out.println(b);
            }
        }
    }
    public void searchBook(String title) {
        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                System.out.println(" Book found: " + b);
                found = true;
            }
        }
        if (!found) {
            System.out.println(" Book not found.");
        }
    }
    public void deleteBook(String isbn) {
        boolean removed = books.removeIf(book -> book.getIsbn().equalsIgnoreCase(isbn));
        if (removed) {
            System.out.println(" Book deleted successfully.");
        } else {
            System.out.println(" Book with ISBN " + isbn + " not found.");
        }
    }
 }

