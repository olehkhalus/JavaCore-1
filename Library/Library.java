import java.time.*;
import java.util.*;

public class Library {
    private String address;
    private LocalTime openingTime;
    private Map<Book, Boolean> books;

    public Library(String address, int openingHour, int openingMinute){
        this.address = address;
        this.openingTime = LocalTime.of(openingHour, openingMinute);
        this.books=new HashMap<>();
    }

    public Map<Book, Boolean> getBooks(){ return books; }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(int openingHour, int openingMinute){
        this.openingTime = LocalTime.of(openingHour, openingMinute);
    }



    @Override
    public String toString() {
        return "Library's address is "+this.getAddress()+", opening time is - "+this.getOpeningTime();
    }
}
