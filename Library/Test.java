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
        Author author1 = new Author("First","Author");
        Book book1 = new Book("First", author1,2000);
        Book book4 = new Book("Fourth", author1,2001);
        one.addBook(book1, 7);
        one.addBook(book4, 3);
        one.addBook(new Book("Second",new Author( "Second","Author"),2005), 3);

        Library two = new Library("Central 12",7,0, 0,0);
        two.addBook(book1, 7);
        two.addBook(new Book("Third",new Author( "Third","Author"),2005), 1);

        LibrariesService librariesService = new LibrariesService();
        librariesService.addLibrary(one);
        librariesService.addLibrary(two);

        Map<Library, String> map = librariesService.findLibraryWhithAuthorName("First Author");

        for (Map.Entry<Library, String> e  :  map.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
        }

        System.out.println();

        Map<Library, String> map1 = librariesService.findLibraryWhithAuthorName("Second Author");

        for (Map.Entry<Library, String> e  :  map1.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
        }

        System.out.println();

        List<Library> lib = librariesService.findBook(book1);

        for ( Library e  :  lib) {
            System.out.println(e.toString());
        }
        LibraryService Serv1 = new LibraryService();

        System.out.println();

        System.out.println(one.getBooks());

        Serv1.takeBook(book4 , new Person("Taras","Mykytiuk"), one);

        System.out.println(one.getBooks());
        System.out.println(one.getTakenBooks());
    }
}
