package Library;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//import java.util.Iterator;
//import java.util.Map;

public class Test {
    public static void main(String[] args) {




        Library one = new Library("Central 147",12,0,23,0);
        
        Book book1 = new Book("First", new Author( "First","Author"),2000);
        Book book4 = new Book("Fourth", new Author( "First","Author"),2001);
        one.addBook(book1, 7);
        one.addBook(book4, 3);
        one.addBook(new Book("Second",new Author( "Second","Author"),2005), 3);

        Library two = new Library("Central 12",7,0, 0,0);
        two.addBook(book1, 7);
        two.addBook(new Book("Third",new Author( "Third","Author"),2005), 1);

        LibrariesService librariesService = new LibrariesService();
        librariesService.addLibrary(one);
        librariesService.addLibrary(two);
        
        Map<Library, String> map = librariesService.findLibraryWhithAuthor("First");
        
        for (Map.Entry<Library, String> e  :  map.entrySet()) {
        	System.out.println(e.getKey()+" "+e.getValue());
        }
        
        System.out.println();
        
        List<Library> lib = librariesService.findBook(book1);
        
        for ( Library e  :  lib) {
        	System.out.println(e.toString());
        }
    }
}

