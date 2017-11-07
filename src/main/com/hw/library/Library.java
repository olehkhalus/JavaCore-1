import java.util.List;
import java.util.ArrayList;

public class Library {

    private String address;
    private List<Book> bookList;
   
    public Library() {
        this("UNKNOWN", new ArrayList<>());
    }

    public Library(String address, List<Book> bookList) {
        this.address = address;
        this.bookList = bookList;
    }

    public Book getBook(Book book) {
        if (bookList.contains(book)) {
            return book;
        } else {
            return null;
        }
    }


    public List<Book> getBookList() {
        return bookList;
    }

}