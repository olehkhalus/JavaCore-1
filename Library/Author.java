package Library;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String firstName;
    private String lastName;
    private List<Book> books;
    public Author() {

    }

    public Author(String firstName , String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return firstName+" "+lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Book> getBooks() {
        return books;
    }
    public void addBook(Book book) {
        books.add(book);
    }
}
