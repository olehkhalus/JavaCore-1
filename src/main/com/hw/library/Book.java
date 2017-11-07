import java.util.List;
import java.util.ArrayList;
import java.time.Year;

public class Book {

    private List<Author> authorList;
    private String title;
    private Year published;
    private Boolean available;
    
    public Book() {
        this(new ArrayList<>(), "UNKNOWN", Year.of(2017));
    }

    public Book(List<Author> authorList, String title, Year published) {
        this.authorList = authorList;
        this.title = title;
        this.published = published;
        available = true;
    }

    public List<Author> getAuthorList() {
       return authorList;
    }
    
    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }
        
    public String getTitle() {
        return title;
    }        

    public void setTitle(String title) {
        this.title = title;
    }

    public Year getPublished() {
        return published;
    }

    public void setPublished(Year published) {
        this.published = published;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s%n", authorList, title, String.valueOf(published));
    }

}