import library.Book;
import library.Library;   // <-- corrected class name
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library lib = new Library();  // <-- corrected constructor
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Library Management Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Delete Book by ISBN");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Enter a number:");
                sc.next(); // clear invalid input
            }

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    Book book = new Book(title, author, isbn);
                    lib.addBook(book);
                    break;

                case 2:
                    lib.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = sc.nextLine();
                    lib.searchBook(searchTitle);
                    break;

                case 4:
                    System.out.print("Enter ISBN to delete: ");
                    String delIsbn = sc.nextLine();
                    lib.deleteBook(delIsbn);
                    break;

                case 5:
                    System.out.println("Exiting Library System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
