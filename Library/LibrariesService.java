package Library;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibrariesService {
	
	private List<Library> ListOfLibraries = new ArrayList<>();
	private List<Library> BookAvaliableAt = new ArrayList<>();
	
	public LibrariesService() {
		
	}
	
	public void addLibrary( Library Library ) {
		ListOfLibraries.add(Library);
	}
	
	
	public void findBook(Book Book) {
		for ( int i = 0 ; i <ListOfLibraries.size(); i++ ) {			
			if (LocalTime.now().getHour() >= ListOfLibraries.get(i).getIsOpenAt().getHour() && LocalTime.now().getHour() < ListOfLibraries.get(i).getIsClosedAt().getHour() ) {
				if (LocalTime.now().getMinute() > ListOfLibraries.get(i).getIsOpenAt().getMinute()) {
					if (ListOfLibraries.get(i).getLibraryBooks().containsKey(Book)) {
						if (ListOfLibraries.get(i).getLibraryBooks().get(Book) > 0) {
							BookAvaliableAt.add(ListOfLibraries.get(i));
						}
					}
				}
			}
		}
		
		Collections.sort(BookAvaliableAt, new Comparator<Library>() {
			  public int compare(Library o1, Library o2) {
			    return o1.getIsClosedAt().compareTo(o2.getIsClosedAt());
			  }
			});
		
		for ( int i = 0 ; i < BookAvaliableAt.size() ; i++ ) {
			System.out.println("Library at the adress "+BookAvaliableAt.get(i).getLibraryAdress()+" will close at: "+BookAvaliableAt.get(i).getIsClosedAt());
		}
		
		
		
		
	}

}
