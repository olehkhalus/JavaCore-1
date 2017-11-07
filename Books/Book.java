package Books;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;
    private List<Author> authors;

    public String getName() {
        return name;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public Book(String name, ArrayList<Author> authors){
        this.name = name;
        this.authors = authors;
    }
}

