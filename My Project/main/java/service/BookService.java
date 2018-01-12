package service;

import hibernate.BookDao;
import hibernate.CRUDOperations;
import model.Author;
import model.Book;
import model.Country;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private CRUDOperations crudOperations;


    private Book book;
    private List<Book> books;

    public Book setBookForCompare(String nameOfBook, String nameAuthor, String lastNameAythor, Country countryAuthor){
        Author authorForCompare = new Author(nameAuthor,lastNameAythor,countryAuthor);
        ArrayList<Author> authorArrayList = new ArrayList<>();
        authorArrayList.add(authorForCompare);
        Book bookForCompare = new Book(nameOfBook, authorArrayList);
        return bookForCompare;
    }


    public void updateAuthor(Book book, Author author){
        for (Author currentAuthor: book.getAuthors()){
            if (currentAuthor.getFirstName().equals(author.getFirstName()) &&
            currentAuthor.getLastName().equals(author.getLastName()) &&
            currentAuthor.getCountry().equals(author.getCountry())){
                currentAuthor.setId(new BookDao().getIdAuthor(author));
            }else {
                book.getAuthors().add(author);
            }
        }
    }

    public List<String> getNames(Book book){
        List<String> strings = new ArrayList<>();
        for (Author currentAuthor: book.getAuthors()){
            strings.add(currentAuthor.getFirstName());
            strings.add(currentAuthor.getLastName());
        }
        return strings;
    }

}

