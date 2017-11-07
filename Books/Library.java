package Books;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private LocalTime timeOfWorkBegin;
    private LocalTime timeOfWorkClose;
    private String address;

    public Library( ArrayList<Book> books,Integer openingHour, Integer openingMinute, Integer closeHour,Integer closeMinute, String address){
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
    public List<Book> getBooks() { return books; }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }

}
