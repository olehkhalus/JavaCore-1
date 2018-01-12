package model;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private Integer id;
    private String name;
    private List<Author> authors;

    public String getName() {
        return name;
    }
    public void setId(Integer iDBook) { this.id = iDBook; }
    public Integer getId() { return id; }

    public List<Author> getAuthors() {
        return authors;
    }
    public void setName(String name){this.name = name;}
    public void setAuthors(List<Author>authors){this.authors = authors;}

    public Book(){}
    public Book(String name, ArrayList<Author> authors){
        this.name = name;
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        return authors != null ? authors.equals(book.authors) : book.authors == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (authors != null ? authors.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + authors +
                '}';
    }
}

