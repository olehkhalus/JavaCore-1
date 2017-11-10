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

    public Book(){}
    public Book(String name, ArrayList<Author> authors){
        this.name = name;
        this.authors = authors;
    }
    public Book setBookForCompare(String nameOfBook, String nameAuthor, String lastNameAythor, Country countryAuthor){
        Author authorForCompare = new Author(nameAuthor,lastNameAythor,countryAuthor);
        ArrayList<Author> authorArrayList = new ArrayList<>();
        authorArrayList.add(authorForCompare);
        Book bookForCompare = new Book(nameOfBook, authorArrayList);
        return bookForCompare;
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

