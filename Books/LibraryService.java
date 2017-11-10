package Books;

import java.time.LocalTime;
import java.util.*;

public class LibraryService {
    private List<Library> libraries;
    private String currentLibraryAddress = null;
    Map<String,ArrayList<String>> mapBooksByAuthor = new HashMap<>();
    List<String>keysForMap = new ArrayList<>();

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
                    librariesWithSearchingBook.add(currentLibraries);
                }
            }
        }
            if (librariesWithSearchingBook.isEmpty()) {
                System.out.println("We are can't find this book. Sorry!");
            }
            return librariesWithSearchingBook;
        }


    public List<String> getAddressOfNecessaryLibrary(Book searchingBook) {
        List<Library> librariesWithSearchingBook = listOfLibrariesWithSearchingBook(searchingBook);
        ArrayList<String> listOfAddress = new ArrayList<>();
        for (Library currentLibrary : librariesWithSearchingBook) {
            listOfAddress.add(currentLibrary.getAddress());
        }
        return listOfAddress;
    }

    public List <Integer> getNumberOfNecessaryLibrary(Book searchingBook) {
        List<Library> librariesWithSearchingBook = listOfLibrariesWithSearchingBook(searchingBook);
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for (Library currentLibrary : librariesWithSearchingBook) {
            listOfNumbers.add(currentLibrary.getNumberOfLibrary());
        }
        return listOfNumbers;
    }

    public String getAdressByNumber(Integer numberOfLibrary){
       String addressOfLibrary = new String();
        for (Library currentLibrary: libraries){
            if (currentLibrary.getNumberOfLibrary().equals(numberOfLibrary)){
                addressOfLibrary = currentLibrary.getAddress();
            }
        }
        return addressOfLibrary;
    }

    public Boolean isLibraryOpenNow(Integer numberOfLibrary){
        LocalTime currentTime = LocalTime.now();
        Boolean isOpen = false;
        for (Library currentLibrary: libraries){
            if (currentLibrary.getNumberOfLibrary().equals(numberOfLibrary)){
                if(currentTime.getHour()>= currentLibrary.getTimeOfWorkBegin().getHour() &&
                   currentTime.getHour()<currentLibrary.getTimeOfWorkClose().getHour()){
                    isOpen = true;
                }
            }
        }
        return isOpen;
    }
    public Integer libraryIsOpenEarlier(){
        Integer timeMinimum = Integer.MAX_VALUE;
        Integer numberOfLibrary=0;
        String addressOfLibrary = new String();
        for (Library currentLibrary: libraries){
            if (currentLibrary.getTimeOfWorkBegin().getHour() < timeMinimum){
                timeMinimum = currentLibrary.getTimeOfWorkBegin().getHour();
                numberOfLibrary = currentLibrary.getNumberOfLibrary();
            }
        }
        return numberOfLibrary;
    }

        public List<Library> getListOfLybrariesBySearchingAuthor(List<Author> authors) {
            List<Library> lybrariesBySearchingAuthor = new ArrayList<>();
            for (Library currentLibrary : libraries) {
                    if (currentLibrary.isBooksBySearchingAuthorInLibrary(authors)){
                        lybrariesBySearchingAuthor.add(currentLibrary);
                    }
            }
            if (lybrariesBySearchingAuthor.isEmpty()) {
                System.out.println("Sorry, but we have not books by searching author");
            }
            else
                System.out.println(lybrariesBySearchingAuthor.toString());
            return lybrariesBySearchingAuthor;
        }


    public List<Integer> getNumbersOfLibrariesBySearchingAuthor (List<Author> authors){
        List<Integer> numbersOfLibrariesBySearchingAuthor = new ArrayList<>();
        List<Library> lybrariesBySearchingAuthor = new ArrayList<>();
        lybrariesBySearchingAuthor = getListOfLybrariesBySearchingAuthor(authors);
        for (Library currentLibrary: lybrariesBySearchingAuthor){
            numbersOfLibrariesBySearchingAuthor.add(currentLibrary.getNumberOfLibrary());
        }
        return numbersOfLibrariesBySearchingAuthor;
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





