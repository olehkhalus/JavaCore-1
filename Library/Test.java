package Library;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		
		
		
		Library one = new Library("Central 147",12,0,23,0);
		Book Book1 = new Book("First","Author1",2000);
		one.addBook(Book1, 7);
		one.addBook(new Book("Second","Author2",2005), 3);
		
		Library two = new Library("Central 147",12,0, 0,0);
		two.addBook(Book1, 7);
		two.addBook(new Book("Third","Author2",2005), 1);
		
		Iterator<Map.Entry<Book, Integer>> iterator = one.getLibraryBooks().entrySet().iterator();
		
		while ( iterator.hasNext()) {
			Map.Entry<Book, Integer> pair = iterator.next();
			Book Book = pair.getKey();
			Integer NumberOfBooks = pair.getValue();
			Book.outputBook();
		}
		
		LibrariesService LibrariesService = new LibrariesService();
		LibrariesService.addLibrary(one);
		LibrariesService.addLibrary(two);
		
		LibrariesService.findBook(Book1);
		

	}



	

}