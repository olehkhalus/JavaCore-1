import java.time.*;
import java.util.*;

public class Library {
    private String address;
    private LocalTime openingTime;
    private List<Book> books;

    public Library(String address, int openingHour, int openingMinute){
        this.address = address;
        this.openingTime = LocalTime.of(openingHour, openingMinute);
        this.books=new ArrayList<>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

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

    public boolean isBookAvailable(String name, String author){
        boolean isAvailable = false;
        Iterator<Book> iterator = books.iterator();
        Book tmp;
        while(iterator.hasNext()){
            tmp=iterator.next();
            if(tmp.getName().equalsIgnoreCase(name) && tmp.getAuthor().equalsIgnoreCase(author)) {isAvailable = true;}
        }
        return isAvailable;
    }

    public static Library findLibraryWithBook(String name, String author, List<Library> libraries){
        List<Library> availableLibraries = new ArrayList<>();
        for(Library library : libraries){
            if(library.isBookAvailable(name, author)){
                availableLibraries.add(library);
            }
        }
        if(availableLibraries.isEmpty()) {
            return null;
        }
        else{
            Collections.sort(availableLibraries, Comparator.comparingInt(o -> o.getOpeningTime().toSecondOfDay()));
            System.out.print("You can find this book there: ");
            return availableLibraries.get(0);
        }
    }

    @Override
    public String toString() {
        return "Library's address is "+this.getAddress()+", opening time is - "+this.getOpeningTime();
    }
}
