package SQL;

import model.Book;
import model.Library;

import java.util.HashMap;
import java.util.Map;

public class libraries {
    public void setBookToLibrary(Library library, Book book, Integer quantity){
         //знайти ID книги по назві і авторах
    }

    public Map<Book, Integer> getBooksFromLibrary(Library library, Book book, Integer quantity){
        HashMap<Book,Integer> books = (HashMap<Book, Integer>) library.getBooks();

        return books;
    }
}
