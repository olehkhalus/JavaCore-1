package Books;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LibraryService {
    private List<Library> libraries;
    private List<Library> librariesVsSearchingBook;
    private String currentLibraryAddress = null;
    HashMap<String,ArrayList<String>> mapBooksByAuthor = new HashMap<>();
    ArrayList<String>keysForMap = new ArrayList<>();

    public LibraryService(List<Library> libraries, List<Library> librariesVsSearchingBook) {
        this.libraries = libraries;
        this.librariesVsSearchingBook = librariesVsSearchingBook;
    }

    public void setLibraries(List<Library> libraries) {
        this.libraries = libraries;
    }

    public List listOfLibrariesVsSearchingBook(String nameOfSearchingBook) {

        for (Library currentLibraries : libraries) {
            for (Book currentBook : currentLibraries.getBooks()) {
                if (currentBook.getName().toLowerCase().equals(nameOfSearchingBook.toLowerCase())) {
                    librariesVsSearchingBook.add(currentLibraries);
                }
            }
        }
        if (librariesVsSearchingBook.isEmpty()) {
            System.out.println("We are can't find this book. Sorry!");
            return null;
        } else {
            return librariesVsSearchingBook;
        }
    }

    public void getAddressOfNecessaryLibrary() {
        LocalTime currentTime = LocalTime.now();
        Integer timeMinimum = 12;
        for (Library currentLibrary : librariesVsSearchingBook) {
            if (currentTime.getHour() >= currentLibrary.getTimeOfWorkBegin().getHour()
                    && currentTime.getHour() + 1 < currentLibrary.getTimeOfWorkClose().getHour()) {
                System.out.printf("This book you can find at the address: %s", currentLibrary.getAddress());
                return;
            } else {
                for (Library timeToOpen : librariesVsSearchingBook) {
                    if (timeMinimum > timeToOpen.getTimeOfWorkBegin().getHour()) {
                        timeMinimum = timeToOpen.getTimeOfWorkBegin().getHour();
                        currentLibraryAddress = timeToOpen.getAddress();
                    }
                }
            }
        }
        if (librariesVsSearchingBook.isEmpty()) {
            return;
        } else {
            System.out.printf("This book you can find at the address: %s. This library will be open at %d o'clck",
                    currentLibraryAddress, timeMinimum);
        }
    }


    public void fillTheMapOfLybrariesByAuthor(String authorFirstName, String authorLastName) {
        for (Library currentLibrary : libraries) {
            ArrayList<String> booksByAuthor = new ArrayList<>();
            String address = null;
            for (Book currentBook : currentLibrary.getBooks()) {
                for (Author currentAuthor : currentBook.getAuthors()) {
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
    }

    public void printAllAddressLibrariesBySearchingAuthor (){
        for (String keys: keysForMap) {
            System.out.println();
            System.out.printf("You can find these books: %s, by the your searching author: at the address: %s",
                    mapBooksByAuthor.get(keys), keys);
            for (Library currentLibrary: libraries){
                if (currentLibrary.getAddress().equals(keys)){
                    System.out.println();
                    System.out.printf("This library working from %d to %d o'clock",
                            currentLibrary.getTimeOfWorkBegin().getHour(), currentLibrary.getTimeOfWorkClose().getHour());
                }
            }
        }
    }
}





