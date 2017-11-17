package Library;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LibrariesService {
    private List<Library> listOfLibraries = new ArrayList<>();

    public LibrariesService() {

    }

    public void addLibrary( Library Library ) {
        listOfLibraries.add(Library);
    }

    public List<Library> findBook(Book book) {
        List<Library> res = new ArrayList<Library>();

        for ( Library library : listOfLibraries) {
        	
            if (library.isBookInLibrary(book) && library.isBookAvailable(book) ) {
                res.add(library);
            }
        }

        Collections.sort(res, (Library o2 , Library o1) 
        	-> {return o2.getOpeningTime().compareTo(o1.getOpeningTime());}
        );
           

        return res;
    }
    
    public List<Library> findBookByName(String bookName) {
        List<Library> res = new ArrayList<Library>();
        
        for ( Library library : listOfLibraries) {        	
        	Map<Book, Integer> map = library.getBooks();
        	
            for(Map.Entry<Book , Integer> e : map.entrySet()) {
                if ( e.getKey().getBookName() == bookName ) {
                	if ( library.isBookAvailable(e.getKey()) ) {
                		res.add(library);
                	}
                }
            }
        }

        Collections.sort(res, (Library o2 , Library o1) 
        	-> {return o2.getOpeningTime().compareTo(o1.getOpeningTime());}
        );
           

        return res;
    }

    public Map<Library, String> findLibraryWhithAuthor( String authorName) {
    	Map<Library, String> mapLibraries = new HashMap<>();
    	
    	for ( Library library : listOfLibraries ) {
    		
    		int authorBooksCount = 0 ;
    		
    		Map<Book, Integer> mapBooks = library.getBooks();
        	
        	for(Map.Entry<Book , Integer> e : mapBooks.entrySet()) {
                if ( e.getKey().getBookAuthor().getFirstName() == authorName ) {     // If use getName() , it don't work!?
                	authorBooksCount++;
                }
            }
        	
        	if ( authorBooksCount > 0) {
        		mapLibraries.put(library, "Number of books by this author in library: "+authorBooksCount);
        	}	
    	}
    	
    	return mapLibraries;
    }
    
    public List<Library> findBookRightNow(Book book) {

        List<Library> res = new ArrayList<Library>();

        for (Library library : listOfLibraries) {
            if (LocalTime.now().getHour() >= library.getOpeningTime().getHour() && LocalTime.now().getMinute() >= library.getOpeningTime().getMinute() && LocalTime.now().getHour() < library.getEndOfWorkTime().getHour() ) {
                if (library.isBookInLibrary(book) && library.isBookAvailable(book) ) {
                    res.add(library);
                }
            }
        }
        
        Collections.sort(res, (Library o1 , Library o2) 
            	-> {return o1.getOpeningTime().compareTo(o2.getOpeningTime());}
            );

        return res;
    }
}
