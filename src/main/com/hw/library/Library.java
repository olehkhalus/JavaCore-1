package library;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Library {

    private String address;
    private List<Book> allBooks;
    private List<Book> availableBooks;
    private List<Book> borrowedBooks;

    public Library() {
        this("UNKNOWN");
    }        

    public Library(String address) {
        this.address = address;
        allBooks = new Inventory().loadBooks();
    }

    public void addBook(Book book) {
        allBooks.add(book);
    }

    public void removeBook(Book book) {
        allBooks.remove(book);
    }

    public void borrowBook(Book book) {
        if (!book.isBorrowed()) {
            book.borrowed();
        }
    }

    public void returnBook(Book book) {
        if (book.isBorrowed()) {
            book.returned();
        }
    }

    public List<Book> getAll() {
        return allBooks;
    }

    public List<Book> getByTitle() {
        List<Book> res = allBooks;
        Collections.sort(res, (o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
        return res;
    }

    public List<Book> getByAuthor() {
         List<Book> res = allBooks;
        Collections.sort(res, (o1, o2) -> (o1.getAuthor()).compareTo(o2.getAuthor()));
        return res;
    }

    public List<Book> getBorrowedBooks() {
        mapper();
        return borrowedBooks;
    }

    public List<Book> getAvailableBooks() {
        mapper();
        return availableBooks;
    }

    private void mapper() {
        availableBooks = new ArrayList<>();
        borrowedBooks = new ArrayList<>();
        Iterator iter = allBooks.iterator();
        while (iter.hasNext()) {
            Book b = (Book) iter.next();
            if (!b.isBorrowed()) {
                availableBooks.add(b);
            } else {
                borrowedBooks.add(b);
            }
        }
    }
}