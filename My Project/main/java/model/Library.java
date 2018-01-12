package model;

import java.time.LocalTime;
import java.util.*;

public class Library {
    private LocalTime timeOfWorkBegin;
    private LocalTime timeOfWorkClose;
    private Integer iDLibrary;
    private String address;
    private Map<Book, Integer> mapBooksAndCount;
//    private Set<Book> books;

    private List<FeedbackBookPerson> feedbackBookPerson = new ArrayList<>();
    public Map<Book, Integer> getMapBooksAndCount() { return mapBooksAndCount; }

    public Library(){}
    public Library( Map<Book,Integer>mapBooks,Integer openingHour, Integer openingMinute,
                    Integer closeHour,Integer closeMinute, String address){
        this.mapBooksAndCount = mapBooks;
        this.timeOfWorkBegin = LocalTime.of(openingHour, openingMinute);
        this.timeOfWorkClose = LocalTime.of(closeHour, closeMinute);
        this.address = address;
    }
    public List<FeedbackBookPerson> getListFeedbackBookPerson() { return feedbackBookPerson; }
    public String getAddress() { return address; }
    public LocalTime getTimeOfWorkBegin() {
        return timeOfWorkBegin;
    }
    public LocalTime getTimeOfWorkClose() {
        return timeOfWorkClose;
    }
    public Set<Book> getBooks() {return mapBooksAndCount.keySet(); }
//   public void setBooks(Set<Book> books){this.books = books;}
    public Integer getiDLibrary() { return iDLibrary; }
    public void setiDLibrary(Integer iDLibrary) { this.iDLibrary = iDLibrary; }
    public void setTimeOfWorkBegin(LocalTime timeOfWorkBegin) { this.timeOfWorkBegin = timeOfWorkBegin; }
    public void setTimeOfWorkClose(LocalTime timeOfWorkClose) { this.timeOfWorkClose = timeOfWorkClose; }
    public void setAddress(String address) { this.address = address; }
    public void setMapBooksAndCount(Map<Book, Integer> mapBooksAndCount) { this.mapBooksAndCount = mapBooksAndCount; }
    public Integer getcountOfBook(Book book) {
        return mapBooksAndCount.get(book);
    }
    public void mapBooksAndCount(Book book, Integer countOfBooks){
        this.mapBooksAndCount.put(book, countOfBooks);
    }
    public List<Author> arrayToArrayList(Author... author){
        return Arrays.asList(author);
    }

    @Override
    public String toString() {
        return "Library{" +
                "timeOfWorkBegin=" + timeOfWorkBegin +
                ", timeOfWorkClose=" + timeOfWorkClose +
                ", iDLibrary=" + iDLibrary +
                ", address='" + address + '\'' +
                ", mapBooksAndCount=" + mapBooksAndCount +
                ", feedbackBookPerson=" + feedbackBookPerson +
                '}';
    }
}
