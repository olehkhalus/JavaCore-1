package Library;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private String adress;
    private LocalTime openingTime;
    private LocalTime endOfWorkTime;
    private Map<Book, Integer > books = new HashMap<>();// integer is the count of avaliable exemplar of this book in library

    public Library() {

    }
    public Library ( String LibraryAdress , int openedHour , int openedMinute  , int closedHour , int closedMinute  ) {
        this.adress = LibraryAdress;
        this.openingTime = LocalTime.of(openedHour, openedMinute);
        this.endOfWorkTime = LocalTime.of(closedHour, closedMinute);
    }



    public String getLibraryAdress() {
        return adress;
    }
    public void setLibraryAdress( String LibraryAdress) {
        this.adress = LibraryAdress;
    }


    public LocalTime getIsOpenAt() {
        return openingTime;
    }
    public void setOpeningTime(LocalTime LibraryIsOpenAt) {
        this.openingTime = LibraryIsOpenAt;
    }


    public LocalTime getIsClosedAt() {
        return endOfWorkTime;
    }
    public void setEndOfWorkTime(LocalTime LibraryIsClosedAt) {
        this.endOfWorkTime = LibraryIsClosedAt;
    }


    public Map<Book, Integer> getBooks() {
        return books;
    }


    public void addBook( Book Book , Integer NumberOfBooks ) {
        books.put(Book, NumberOfBooks);
    }

    public boolean isBookAvailable(Book book){
        return true;
    }

}
