package Books;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private Integer numberOfLibrary;
    private List<Book> books = new ArrayList<>();
    private LocalTime timeOfWorkBegin;
    private LocalTime timeOfWorkClose;
    private String address;

    public Library(){}

    public Library( ArrayList<Book> books,Integer openingHour, Integer openingMinute,
                    Integer closeHour,Integer closeMinute, String address, Integer numberOfLibrary ){
        this.books = books;
        this.timeOfWorkBegin = LocalTime.of(openingHour, openingMinute);
        this.timeOfWorkClose = LocalTime.of(closeHour, closeMinute);
        this.address = address;
        this.numberOfLibrary = numberOfLibrary;
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
    public List<Book> getBooks() { return books; }
    public Integer getNumberOfLibrary() {return numberOfLibrary; }

    public Boolean isBooksBySearchingAuthorInLibrary(List<Author> authors){
        Boolean result = false;
        for (Book currentBook: books){
            if (currentBook.getAuthors().equals(authors)){
                result=true;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }

}
