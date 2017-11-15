package Library;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LibrariesService {
	
	private List<Library> listOfLibraries = new ArrayList<>();
	
	public LibrariesService() {
		
	}
	
	public void addLibrary( Library Library ) {
		listOfLibraries.add(Library);
	}
	
	public void findBook(Book book) {
		List<Library> res = new ArrayList<Library>();
		
		for ( Library library : listOfLibraries) {
			if (library.isBookInLibrary(book) && library.isBookAvailable(book) ) {
                res.add(library);
            		}
		}
		
		Collections.sort(res, new Comparator<Library>() {
			  public int compare(Library o1, Library o2) {
			    return o1.getOpeningTime().compareTo(o2.getOpeningTime());
			  }
			});
		
		Collections.reverse(res);
		
		for ( Library library : res ) {
			System.out.println("Library at the adress "+library.getAdress()+". This library opens in :"+" and will close at: "+library.getEndOfWorkTime());
		}
	}
	
	public void findBookRightNow(Book book) {
		
		List<Library> res = new ArrayList<Library>();
		
		for (Library library : listOfLibraries) {
            if (LocalTime.now().getHour() >= library.getOpeningTime().getHour() && LocalTime.now().getMinute() >= library.getOpeningTime().getMinute() && LocalTime.now().getHour() < library.getEndOfWorkTime().getHour() ) {
                if (library.isBookInLibrary(book) && library.isBookAvailable(book) ) {
                    res.add(library);
                }
            }
        }
		
		Collections.sort(res, new Comparator<Library>() {
			  public int compare(Library o1, Library o2) {
			    return o1.getEndOfWorkTime().compareTo(o2.getEndOfWorkTime());
			  }
			});
		
		for ( Library library : res ) {
			System.out.println("Library at the adress "+library.getAdress()+" will close at: "+library.getEndOfWorkTime());
		}	
	}
}
