package LibraryBook;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<Book>();

    boolean add(Book book) {
        for (Book b : books) {
            if (b.title == book.title)
                return false;
        }
        books.add(book);
        return true;
    }

    boolean removeByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).title == title) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    boolean removeByAuthor(String author) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).author == author) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    boolean remove(String prop) {
        return removeByTitle(prop) ? true : removeByAuthor(prop) ? true : false;
    }

    void getBooks() {
        for (Book b : books)
            System.out.println(b.author + " - " + b.title);
    }
}
