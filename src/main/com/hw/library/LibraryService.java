import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LibraryService {

    private static List<Library> libraryList = new ArrayList<>();
    
    public LibraryService() {
        this(new Library());
    }

    public LibraryService(Library library) {
        libraryList.add(library);
    }

    public void addBook(Library library, Book book) {
        library.getBookList().add(book);
    }

    public void removeBook(Library library, Book book) {
        library.getBookList().remove(book);
    }

    public List<Book> getBookList(Library library) {
        return library.getBookList();
    }

      public List<Book> getBookListByTitle(Library library) {
        List<Book> res = library.getBookList();
        Collections.sort(res, (o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
        return res;
    }

    // public List<Book> getBookListByAuthor(Library library) {
    // }

    // public List<Book> getBookListByYear(Library library) {
    // }

    public void borrowBook(Library library, Book book) {
        if (library.getBookList().contains(book) && library.getBook(book).getAvailable()) {
            library.getBook(book).setAvailable(false);
        }
    } 

    public void returnBook(Library library, Book book) {
        if (library.getBookList().contains(book) && !library.getBook(book).getAvailable()) {
            library.getBook(book).setAvailable(true);
        }
    }

    public List<Book> getAvaibleBookList(Library library) {
        List<Book> res = new ArrayList<>();
        for (Book book : getBookList(library)) {
            if (book.getAvailable()) {
                res.add(book);
            } 
        }
        return res;
    }

    public List<Book> getBorrowedBookList(Library library) {
        List<Book> res = new ArrayList<>();
        for (Book book : getBookList(library)) {
            if (!book.getAvailable()) {
                res.add(book);
            } 
        }
        return res;
    }
}