package Books;

import java.time.LocalTime;
import java.util.*;

public class LibraryService {
    private List<Library> libraries;
    private String currentLibraryAddress = null;
    Map<String, ArrayList<String>> mapBooksByAuthor = new HashMap<>();
    List<String> keysForMap = new ArrayList<>();

    public LibraryService(List<Library> libraries) {
        this.libraries = libraries;
    }

    public void setLibraries(List<Library> libraries) {
        this.libraries = libraries;
    }

    public List<Library> listOfLibrariesWithSearchingBook(Book searchingBook) {
        List<Library> librariesWithSearchingBook = new ArrayList<>();
        for (Library currentLibraries : libraries) {
            for (Book currentBook : currentLibraries.getBooks()) {
                if (currentBook.equals(searchingBook)) {
                    if (currentLibraries.isThisBookAvailable(searchingBook)) {
                        librariesWithSearchingBook.add(currentLibraries);
                    }
                }
            }
        }
        if (librariesWithSearchingBook.isEmpty()) {
            System.out.println("We can't find this book. Sorry!");
        }
        return librariesWithSearchingBook;
    }

    public List<String> getAddressOfLibraries(Book searchingBook) {
        List<Library> librariesWithSearchingBook = listOfLibrariesWithSearchingBook(searchingBook);
        ArrayList<String> listOfAddress = new ArrayList<>();
        for (Library currentLibrary : librariesWithSearchingBook) {
            listOfAddress.add(currentLibrary.getAddress());
        }
        return listOfAddress;
    }

    public String getAdressLibrary(Library oneLibrary) {
        return oneLibrary.getAddress();
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

    public List<Library> getListOfLybrariesByAuthor(Author... authors) throws Exception {
        List<Library> lybrariesBySearchingAuthor = new ArrayList<>();
        for (Library currentLibrary : libraries) {
            if (currentLibrary.isBooksBySearchingAuthorInLibrary(authors)) {
                lybrariesBySearchingAuthor.add(currentLibrary);
            }
        }
        if (lybrariesBySearchingAuthor.isEmpty()) {
            System.out.println("Sorry, but we have not books by searching author");
        } else
            System.out.println(lybrariesBySearchingAuthor.toString());
        return lybrariesBySearchingAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibraryService that = (LibraryService) o;

        if (libraries != null ? !libraries.equals(that.libraries) : that.libraries != null) return false;
        if (currentLibraryAddress != null ? !currentLibraryAddress.equals(that.currentLibraryAddress) : that.currentLibraryAddress != null)
            return false;
        if (mapBooksByAuthor != null ? !mapBooksByAuthor.equals(that.mapBooksByAuthor) : that.mapBooksByAuthor != null)
            return false;
        return keysForMap != null ? keysForMap.equals(that.keysForMap) : that.keysForMap == null;
    }

    @Override
    public int hashCode() {
        int result = libraries != null ? libraries.hashCode() : 0;
        result = 31 * result + (currentLibraryAddress != null ? currentLibraryAddress.hashCode() : 0);
        result = 31 * result + (mapBooksByAuthor != null ? mapBooksByAuthor.hashCode() : 0);
        result = 31 * result + (keysForMap != null ? keysForMap.hashCode() : 0);
        return result;
    }
}