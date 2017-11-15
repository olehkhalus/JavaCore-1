package Library;

import java.util.Iterator;
import java.util.Map;

public class Test {
    public static void main(String[] args) {




        Library one = new Library("Central 147",12,0,23,0);
        Book book1 = new Book("First", new Author( "First","Author"),2000);
        one.addBook(book1, 7);
        one.addBook(new Book("Second",new Author( "Second","Author"),2005), 3);

        Library two = new Library("Central 12",7,0, 0,0);
        two.addBook(book1, 7);
        two.addBook(new Book("Third",new Author( "First","Author"),2005), 1);

        Iterator<Map.Entry<Book, Integer>> iterator = one.getBooks().entrySet().iterator();

        /*while ( iterator.hasNext()) {
            Map.Entry<Book, Integer> pair = iterator.next();
            Book book = pair.getKey();
            Integer NumberOfBooks = pair.getValue();
            System.out.println(book);
        }*/

        LibrariesService librariesService = new LibrariesService();
        librariesService.addLibrary(one);
        librariesService.addLibrary(two);

        librariesService.findBook(book1);
        System.out.println(librariesService.findBook(book1));

    }
}
