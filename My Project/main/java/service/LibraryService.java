package service;

import model.*;

import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class LibraryService {
    private Library library;
    private List<Library> libraries;
    Map<String, ArrayList<String>> mapBooksByAuthor = new HashMap<>();
    List<String> keysForMap = new ArrayList<>();
    private List<FeedbackBookPerson> feedbackBookPerson = new ArrayList<>();

    public LibraryService(List<Library> libraries) {
        this.libraries = libraries;
    }

    public void setLibraries(List<Library> libraries) {
        this.libraries = libraries;
    }

    public List<Library> librariesWithBook(Book searchingBook) {
        List<Library> librariesWithSearchingBook =
        libraries.stream().filter(library -> isAvailable(searchingBook))
        .collect(Collectors.toList());

        if (librariesWithSearchingBook.isEmpty()) {
            System.out.println("We can't find this book. Sorry!");
        }
        return librariesWithSearchingBook;
    }

    public String getAdressLibrary(Library oneLibrary) {
        return oneLibrary.getAddress();
    }

    public Boolean isBooksByAuthorInLibrary(Library library, Author... author){
        final List <Author> authors = Arrays.asList(author);
        Boolean result = false;
        for (Book currentBook: library.getBooks() ) {
            currentBook.getAuthors().retainAll(authors);
            if (currentBook.getAuthors().size() == authors.size() && isAvailable(currentBook)){
                result = true;
            }
        }
        return result;
    }

    public List<Library> getLibrariesByAuthor(Author... authors) throws Exception {
        List<Library> librariesBySearchingAuthor = new ArrayList<>();
        for (Library currentLibrary : libraries) {
            if (isBooksByAuthorInLibrary(currentLibrary ,authors)) {
                librariesBySearchingAuthor.add(currentLibrary);
            }
        }
        if (librariesBySearchingAuthor.isEmpty()) {
            System.out.println("Sorry, but we have not books by searching author");
        } else
            System.out.println(librariesBySearchingAuthor.toString());
        return librariesBySearchingAuthor;
    }

    public Boolean isAvailable(Book book) {
        return (library.getMapBooksAndCount().get(book) >= 1);
    }

    public void getBook(Person person, Book book) throws Exception{
        library.getMapBooksAndCount().put(book,library.getMapBooksAndCount().get(book)-1);
        new PersonService().addToList(person, book);
    }

    public  void takeBook(Person  person, Book book) throws Exception {
        if (new PersonService().removeFromList(person, book)) {
            Integer i=library.getMapBooksAndCount().get(book);
            library.getMapBooksAndCount().put(book, i+1);
        } else {
            System.err.println("You don't have this book, you can't return it");
        }
    }
    public Map<Book, Double> mapOfBookRating(){
        HashMap<Book, Double> mapBooksByRating  = (HashMap<Book, Double>) library.getListFeedbackBookPerson().
                stream().collect(Collectors.toMap(f->f.getBook(), f->getBookRating(f.getBook()), (p1,p2)->p1));
        return mapBooksByRating.entrySet().stream().sorted(Map.Entry.<Book, Double>comparingByValue()
                .reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o1,o2)->o1, LinkedHashMap::new));
    }

    public Double getBookRating(Book book) {
        Double sumOfRating = 0.00;
        Double count = 0.00;
        for (Feedback currentFeedback : getFeedbacks(book)) {
            sumOfRating += currentFeedback.getRating();
            count++;
        }
        if (count.equals(0)) {
            System.err.println("Count can't to be zero");
            return 0.0;
        } else {
            return sumOfRating / count;
        }
    }

    public List<Feedback> getFeedbacks(Book book){
        List<Feedback> feedbackList = new ArrayList<>();
        for (FeedbackBookPerson currentFBP: feedbackBookPerson){
            if(currentFBP.getBook().equals(book)){
                feedbackList.add(currentFBP.getFeedback());
            }
        }
        return feedbackList;
    }

    public List<Feedback> getFeedbacks(Person person){
        List<Feedback> feedbackList = new ArrayList<>();
        for (FeedbackBookPerson currentFBP: feedbackBookPerson){
            if(currentFBP.getPerson().equals(person)){
                feedbackList.add(currentFBP.getFeedback());
            }
        }
        return feedbackList;
    }

    public List<Feedback> allNegFeedbacks(Person person){
        List<Feedback> negFeedbackList = new ArrayList<>();
        for (Feedback currentFeedback: getFeedbacks(person)){
            if (currentFeedback.getTypeFeedback()==false){
                negFeedbackList.add(currentFeedback);
            }
        }
        return negFeedbackList;
    }

    public List<Book> getHiRatingBook(Map<Book, Double> mapBooksByRating){
        Double maxRat =mapBooksByRating.values().stream().mapToDouble(Double::doubleValue).max().getAsDouble();
        return mapBooksByRating.keySet().stream().filter(a->mapBooksByRating.get(a).equals(maxRat)).collect(Collectors.toList());
    }

    public Boolean isLibraryOpenNow(Library library) {
        if (libraries.contains(library)) {
            LocalTime currentTime = LocalTime.now();
            Boolean isOpen = false;
            if (currentTime.getHour() >= library.getTimeOfWorkBegin().getHour() &&
                    currentTime.getHour() < library.getTimeOfWorkClose().getHour()) {
                isOpen = true;
            }
            return isOpen;
        } else {
            System.out.println("We have not information about this library");
            return false;
        }
    }

    public Library libraryIsOpenEarlier() {
        Integer timeMinimum = Integer.MAX_VALUE;
        Library libraryErlier = new Library();
        for (Library currentLibrary : libraries) {
            if (currentLibrary.getTimeOfWorkBegin().getHour() < timeMinimum) {
                timeMinimum = currentLibrary.getTimeOfWorkBegin().getHour();
                libraryErlier = currentLibrary;
            }
        }
        return libraryErlier;
    }

}