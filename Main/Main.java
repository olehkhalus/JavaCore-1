package Main;
import Books.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String...args) {
        ArrayList<Library> libraries = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Book> books1 = new ArrayList<>();
        Author shevchenko = new Author("Taras", "Shevchenko", Country.UKRAINE);
        ArrayList<Author> arrayShevchenko = new ArrayList<>();
        arrayShevchenko.add(shevchenko);
        Book kobzar = new Book("Kobzar", arrayShevchenko);
        Book zapovit = new Book("Zapovit", arrayShevchenko);
        Book son = new Book("Son", arrayShevchenko);
        Book kavkaz = new Book("Kavkaz", arrayShevchenko);
        Author eckel = new Author("Bruce", "Eckel", Country.USA);
        ArrayList<Author> arrayAckel = new ArrayList<>();
        arrayAckel.add(eckel);
        ArrayList<Author> eckelAndShevchenko = new ArrayList<>();
        eckelAndShevchenko.add(eckel);
        eckelAndShevchenko.add(shevchenko);
        Book javaPhilosophy = new Book("Java philosophy", eckelAndShevchenko);
        Author bulgakov = new Author("Myhail", "Bulgakov", Country.UKRAINE);
        ArrayList<Author> arrayBulg = new ArrayList<>();
        arrayBulg.add(bulgakov);
        Book master = new Book("Master y margaryta", arrayBulg);
        ArrayList<Author> bulgAndEckel = new ArrayList<>();
        bulgAndEckel.add(bulgakov);
        bulgAndEckel.add(eckel);
        Book dogHeart = new Book("Dog heart", bulgAndEckel);

        books.add(kobzar);
        books.add(zapovit);
        books.add(son);
        books.add(kavkaz);
        books.add(javaPhilosophy);
        books.add(master);
        books.add(dogHeart);

        Map<Book, Integer> libraryMap1 = new HashMap<>();
        libraryMap1.put(kobzar,3);
        libraryMap1.put(zapovit,1);
        libraryMap1.put(son,2);
        libraryMap1.put(kavkaz,2);
        libraryMap1.put(javaPhilosophy,2);
        libraryMap1.put(master,2);
        libraryMap1.put(dogHeart,1);
        BookAvailability bookAvailability1= new BookAvailability();
        bookAvailability1.setMap(libraryMap1);

        Library library1 = new Library(books, 9, 00, 22, 00,
                "Chernivtsi, Golovna str., 200");
        Library library2 = new Library(books, 8, 00, 23, 00,
                "Chernivtsi, Golovna str., 100");
        Library library3 = new Library(books1, 8, 00, 20, 00,
                "Chernivtsi, Golovna str., 10");

        library1.setBookAvailability(bookAvailability1);

        libraries.add(library1);
        libraries.add(library2);
        libraries.add(library3);
        ArrayList<Library> librariesVsSearchingBook = new ArrayList<>();
        LibraryService libraryService = new LibraryService(libraries);

        Book searchingBook = new Book();
        searchingBook = searchingBook.setBookForCompare("Son", "Taras", "Shevchenko", Country.UKRAINE);

        for (String carrentAddress: libraryService.getAddressOfLibraries(searchingBook)){
            System.out.println(carrentAddress);
        }

        Author searchingAuthor = new Author("Taras", "Shevchenko", Country.UKRAINE);
        ArrayList<Author> searchingAuthors = new ArrayList<>();
        searchingAuthors.add(searchingAuthor);
        for (Library library : libraryService.getListOfLybrariesByAuthor(searchingAuthor)) {
            System.out.println(library);
        }

        System.out.println(libraryService.isThisBookAvailable(searchingBook,library1));
    }
    }

