package Books;

import java.util.ArrayList;

public class Book {
    private String name;
    private ArrayList<Author> authors;

    public String getName() {
        return name;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public Book(String name, ArrayList<Author> authors){
        this.name = name;
        this.authors = authors;
    }
}

