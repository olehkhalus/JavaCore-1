package Books;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private ArrayList<Book> books;
    private Integer timeOfWorkBegin;
    private Integer timeOfWorkClose;
    private String address;

    public Library( ArrayList<Book> books,Integer timeOfWorkBegin, Integer timeOfWorkClose, String address){
        this.books = books;
        this.timeOfWorkBegin = timeOfWorkBegin;
        this.timeOfWorkClose = timeOfWorkClose;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    public Integer getTimeOfWorkBegin() {
        return timeOfWorkBegin;
    }
    public Integer getTimeOfWorkClose() {
        return timeOfWorkClose;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }

    public void findBookByName(String bookName, ArrayList<Library> librarys) {
        String carrentAddress = null;
        ArrayList<Library> librariesVsCurrentBook = new  ArrayList<>();
        for (Library carrentLibraries : librarys) {
            for (Book currentBook : carrentLibraries.getBooks()) {
                if (currentBook.getName().toLowerCase().equals(bookName.toLowerCase())) {
                    librariesVsCurrentBook.add(carrentLibraries);
                }
            }
        }
        if (librariesVsCurrentBook.isEmpty()) {
            System.out.println("0");
        } else {
            LocalTime currentTime = LocalTime.now();
            Integer currTime = currentTime.getHour();
            Integer timeMinimum = 12;
            String libraryAddress = null;
            for (Library currentLibrary : librariesVsCurrentBook) {
                if (currTime >= currentLibrary.getTimeOfWorkBegin() && currTime+1 < currentLibrary.getTimeOfWorkClose()) {
                    System.out.printf("This book you can find at the address: %s", address);
                    return;
                } else {
                    for (Library timeToOpen : librariesVsCurrentBook) {
                        if (timeMinimum > timeToOpen.getTimeOfWorkBegin()) {
                            timeMinimum = timeToOpen.getTimeOfWorkBegin();
                            libraryAddress = timeToOpen.getAddress();
                        }
                    }
                }
            }
            System.out.printf("This book you can find at the address: %s. This library will be open at %d o'clck",
                    libraryAddress, timeMinimum);
        }
    }

    public void findBookByAuthor(String authorFirstName, String authorLastName,ArrayList<Library> libraries){
        HashMap<String,ArrayList<String>> mapBooksByAuthor = new HashMap<>();
        ArrayList<String>keysForMap = new ArrayList<>();

        for (Library currentLibrary: libraries){
            ArrayList<String> booksByAuthor = new ArrayList<>();
            String address=null;
            for (Book currentBook: currentLibrary.getBooks()){
                for (Author currentAuthor: currentBook.getAuthors()) {
                    if (currentAuthor.getFirstName().toLowerCase().equals(authorFirstName.toLowerCase())
                            && currentAuthor.getLastName().toLowerCase().equals(authorLastName.toLowerCase())) {
                        booksByAuthor.add(currentBook.getName());
                        address = currentLibrary.getAddress();
                    }
                }
            }
            if (address != null) {
                mapBooksByAuthor.put(address, booksByAuthor);
                keysForMap.add(address);
            }
        }
        for (String keys: keysForMap) {
            System.out.println();
            System.out.printf("You can find these books: %s, by the: %s %s at the address: %s", mapBooksByAuthor.get(keys),
                    authorFirstName, authorLastName, keys);
            for (Library currentLibrary: libraries){
                if (currentLibrary.getAddress().equals(keys)){
                    System.out.println();
                    System.out.printf("This library working from %d to %d o'clck", currentLibrary.getTimeOfWorkBegin(),
                            currentLibrary.getTimeOfWorkClose());
                }
            }
        }
    }

}
