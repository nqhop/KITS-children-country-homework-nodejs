package LibraryBook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        // Init
        lib.add(new Book("Harry Potter", "J. K. Rowling"));
        lib.add(new Book("Theory of Everything", "Steven Howking"));

        lib.getBooks(); // [Book("Harry Potter", "J. K. Rowling"), Book("Theory of Everything", "Steven
                        // Howking")]

        // Remove none exist book
        System.out.println("\nRemove none exist book");
        lib.remove("Naruto");
        lib.getBooks(); // [Book("Harry Potter", "J. K. Rowling"), Book("Theory of Everything", "Steven
                        // Howking")]

        // Remove by title
        System.out.println("\nRemove by title");
        lib.remove("Harry Potter");
        lib.getBooks(); // [Book("Theory of Everything", "Steven Howking")]

        // Remove by author
        System.out.println("\nRemove by author");
        lib.remove("Steven Howking");
        lib.getBooks(); // []
    }
}
