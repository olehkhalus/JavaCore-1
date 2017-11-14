package Library;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String fullName; // FN, LN
    private List<Book> books;

    public Author() {

    }

    public Author(String AuthorName , ArrayList<Book> AuthorBooks) {
        this.fullName = AuthorName;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String AuthorName) {
        this.fullName = AuthorName;
    }

    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(String AuthorName) {
        this.books = books;
    }
}

