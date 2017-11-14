package Library;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LibrariesService {
    private List<Library> listOfLibraries = new ArrayList<>();
    //private List<Library> listOfLibrariesWithSearchedBook = new ArrayList<>();

    public LibrariesService() {

    }

    public void addLibrary( Library Library ) {
        listOfLibraries.add(Library);
    }


    public List<Library> findBook(Book book) {
        List<Library> res = new ArrayList<Library>();

        for (Library library : listOfLibraries) {
            if (LocalTime.now().getHour() >= library.getIsOpenAt().getHour() && LocalTime.now().getMinute() >= library.getIsOpenAt().getMinute() && LocalTime.now().getHour() < library.getIsClosedAt().getHour() ) {
                if (library.getBooks().containsKey(book) && library.isBookAvailable(book) ) {
                    // if (listOfLibraries.get(i).getBooks().get(Book) > 0) {
                    res.add(library);
                    //}
                }
            }
        }

        for (int i = 0; i < listOfLibraries.size(); i++ ) {
            if (LocalTime.now().getHour() >= listOfLibraries.get(i).getIsOpenAt().getHour() && LocalTime.now().getMinute() >= listOfLibraries.get(i).getIsOpenAt().getMinute() && LocalTime.now().getHour() < listOfLibraries.get(i).getIsClosedAt().getHour() ) {
                if (listOfLibraries.get(i).getBooks().containsKey(book) && listOfLibraries.get(i).isBookAvailable(book) ) {
                   // if (listOfLibraries.get(i).getBooks().get(Book) > 0) {
                        res.add(listOfLibraries.get(i));
                    //}
                }
            }

        }

        Collections.sort(res, new Comparator<Library>() {
            public int compare(Library o1, Library o2) {
                return o1.getIsClosedAt().compareTo(o2.getIsClosedAt());
            }
        });

        /*for (int i = 0; i < listOfLibrariesWithSearchedBook.size() ; i++ ) {
            System.out.println("Library at the adress "+ listOfLibrariesWithSearchedBook.get(i).getLibraryAdress()+" will close at: "+ listOfLibrariesWithSearchedBook.get(i).getIsClosedAt());
        }*/
        Collections.reverse(res);
        return res;
    }

}
