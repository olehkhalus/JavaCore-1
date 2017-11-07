import java.util.List;
import java.util.ArrayList;


public class Author {
    
    // private List<Book> bookList;
    private String firsName;
    private String lastName;

    public Author() {
        this(/*new ArrayList<>(),*/ "UNKNOWN", "UNKNOWN");
    }

    public Author(/*List<Book> bookList,*/ String firsName, String lastName) {
        // this.bookList = bookList;
        this.firsName = firsName;
        this.lastName = lastName;
    }

    // public List<Book> getBookList() {
    //    return bookList;
    // }
    
    // public void setBooks(List<Book> bookList) {
    //     this.bookList = bookList;
    // }
        
    public String getFirsName() {
        return firsName;
    }        

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}