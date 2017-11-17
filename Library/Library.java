package Library;

import javax.swing.plaf.synth.SynthUI;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private String adress;
    private LocalTime openingTime;
    private LocalTime endOfWorkTime;
    private Map<Book, Integer > books = new HashMap<>(); // integer is the count of avaluable exemplar of this book in library
    private Map<Book , Person> listOfTakenBooks = new HashMap<>();

    public Library() {

    }
    public Library ( String adress , int openedHour , int openedMinute  , int closedHour , int closedMinute  ) {
        this.adress = adress;
        this.openingTime = LocalTime.of(openedHour, openedMinute);
        this.endOfWorkTime = LocalTime.of(closedHour, closedMinute);
    }

    public String getAdress() {
        return adress;
    }
    public void setAdress( String adress) {
        this.adress = adress;
    }

    public LocalTime getOpeningTime() {
        return openingTime;
    }
    public void setLibraryOpeningTime( LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public LocalTime getEndOfWorkTime() {
        return endOfWorkTime;
    }
    public void setEndOfWorkTime( LocalTime endOfWorkTime) {
        this.endOfWorkTime = endOfWorkTime;
    }

    public Map<Book , Integer> getBooks() {
        return books;
    }
    public void setBooks(Map<Book , Integer> books ){
        this.listOfTakenBooks = listOfTakenBooks;
    }

    public Map<Book , Person> getTakenBooks() {
        return listOfTakenBooks;
    }
    public void setTakenBooks(){
        this.books = books;
    }

    public void addBook( Book book , Integer NumberOfBooks ) {
        books.put(book, NumberOfBooks);
    }

    public boolean isBookInLibrary(Book book) {
        if (books.containsKey(book)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBookAvailable(Book book) {
        if ( books.get(book) > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    /*
    public void takeBook( Book book , Person person , Library library){
        if ( library.isBookAvailable(book) ){
            Map<Book, Integer> mapBooks = library.getBooks();
            for (Map.Entry<Book , Integer> e : mapBooks.entrySet()) {
                if ( !mapBooks.containsKey(book)){
                    mapBooks.put(book , e.getValue()-1);
                    library.setBooks(mapBooks);

                }
            }
        } else {
            System.out.println("Searched book is not available in this library");
        }
    }
     */


    @Override
    public String toString() {
        return "Library adress "+adress+". This library opens in: "+getOpeningTime()+" and closed at:  "+getEndOfWorkTime();
    }
}
