package Books;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private LocalTime timeOfWorkBegin;
    private LocalTime timeOfWorkClose;
    private String address;
    private BookAvailability bookAvailability;

    public Library(){}
    public Library( ArrayList<Book> books,Integer openingHour, Integer openingMinute,
                    Integer closeHour,Integer closeMinute, String address){
        this.books = books;
        this.timeOfWorkBegin = LocalTime.of(openingHour, openingMinute);
        this.timeOfWorkClose = LocalTime.of(closeHour, closeMinute);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    public LocalTime getTimeOfWorkBegin() {
        return timeOfWorkBegin;
    }
    public LocalTime getTimeOfWorkClose() {
        return timeOfWorkClose;
    }
    public List<Book> getBooks() {
        return books; }
    public BookAvailability getBookAvailability() {
        return bookAvailability;
    }

    public void setBookAvailability(BookAvailability bookAvailability) {
        this.bookAvailability = bookAvailability;
    }

    public Boolean isBooksBySearchingAuthorInLibrary(Author... author){
        List <Author> authors = new ArrayList<>();
        for (int i=0; i<author.length; i++){
            authors.add(author[i]);
        }
        Boolean result = false;
        for (Book currentBook: books){
            if (currentBook.getAuthors().equals(authors)){
                result=true;
            }
        }
        return result;
    }

    public Integer numberOfBooks(Book book){
      return bookAvailability.getMap().get(book);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }

}
