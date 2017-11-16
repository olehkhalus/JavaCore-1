package Books;

import java.time.LocalTime;
import java.util.*;

public class Library {
    private LocalTime timeOfWorkBegin;
    private LocalTime timeOfWorkClose;
    private String address;
    private Map<Book, Integer> mapBooksAndNumbers;

    public Library(){}
    public Library( Map<Book,Integer>mapBooks,Integer openingHour, Integer openingMinute,
                    Integer closeHour,Integer closeMinute, String address){
        this.mapBooksAndNumbers = mapBooks;
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
    public Set<Book> getBooks() {return mapBooksAndNumbers.keySet(); }

    public Integer getnumbersOfBook(Book book) {
        return mapBooksAndNumbers.get(book);
    }

    public void setMapBooksAndNumbers(Book book, Integer numberOfBooks){
        this.mapBooksAndNumbers.put(book, numberOfBooks);
    }
    public List<Author> getBackListOfAuthors(Author... author) {
        List<Author> authors = new ArrayList<>();
        for (int i = 0; i < author.length; i++) {
            authors.add(author[i]);
        }
        Collections.sort(authors, (o1, o2) -> o1.toString().compareTo(o2.toString()));
        return authors;
    }
    public Boolean oneAuthor(List<Author> authors){
        Boolean result = false;
        for (Book currentBook : getBooks()) {
            for (Author currentAuthor : currentBook.getAuthors()){
                if (currentAuthor.equals(authors.get(0))) {
                    if (isThisBookAvailable(currentBook)) {
                        result = true;
                    }
                }
            }
        }
        return result;
    }
    public Boolean moreTheOneAuthor(List<Author> authors){
        Boolean result = false;
        for (Book currentBook : getBooks()) {
            if (currentBook.getAuthors().equals(authors)) {
                Collections.sort(currentBook.getAuthors(), (o1, o2) -> o1.toString().compareTo(o2.toString()));
                if (isThisBookAvailable(currentBook)) {
                    result = true;
                }
            }
        }
        return result;
    }

    public Boolean isBooksBySearchingAuthorInLibrary(Author... author) throws Exception{
        List <Author> authors = new ArrayList<>();
        authors = getBackListOfAuthors(author);
        Boolean result = false;
        if (authors.size() == 1){
           result = oneAuthor(authors);
        }
        if (authors.size() > 1) {
            result = moreTheOneAuthor(authors);
        }
        return result;
    }

    public Boolean isThisBookAvailable(Book book) {
        return (mapBooksAndNumbers.get(book) >= 1);
    }

    public void getBook(Person person, Book book) throws Exception{
       mapBooksAndNumbers.put(book,mapBooksAndNumbers.get(book)-1);
       person.addToList(book);
    }

    public  void returnBook(Person  person, Book book) throws Exception {
        if (person.removeFromList(book)) {
            Integer i=mapBooksAndNumbers.get(book);
            mapBooksAndNumbers.put(book, i+1);
        } else {
            System.out.println("You don't have this book, you can't return it");
        }
    }


    @Override
    public String toString() {
        return "Library{" +
                ", address='" + address +
                '}';
    }

}
