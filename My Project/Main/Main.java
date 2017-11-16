package Main;
import Books.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String... args) {
        ArrayList<Library> libraries = new ArrayList<>();
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

        Map<Book, Integer> libraryMap1 = new HashMap<>();
        libraryMap1.put(kobzar, 3);
        libraryMap1.put(zapovit, 1);
        libraryMap1.put(son, 10);
        libraryMap1.put(kavkaz, 2);
        libraryMap1.put(javaPhilosophy, 2);
        libraryMap1.put(master, 2);
        libraryMap1.put(dogHeart, 1);

        Map<Book, Integer> libraryMap2 = new HashMap<>();
        libraryMap2.put(kobzar, 5);
        libraryMap2.put(zapovit, 3);
        libraryMap2.put(kavkaz, 1);
        libraryMap2.put(javaPhilosophy, 2);
        libraryMap2.put(dogHeart, 2);

        Map<Book, Integer> libraryMap3 = new HashMap<>();
        libraryMap3.put(kobzar, 0);
        libraryMap3.put(javaPhilosophy, 0);

        Library library1 = new Library(libraryMap1, 9, 00, 22, 00,
                "Chernivtsi, Golovna str., 200");
        Library library2 = new Library(libraryMap2, 8, 00, 23, 00,
                "Chernivtsi, Golovna str., 100");
        Library library3 = new Library(libraryMap3, 8, 00, 20, 00,
                "Chernivtsi, Golovna str., 10");

        libraries.add(library1);
        libraries.add(library2);
        libraries.add(library3);
        ArrayList<Library> librariesVsSearchingBook = new ArrayList<>();
        LibraryService libraryService = new LibraryService(libraries);

        Book searchingBook = new Book();
        searchingBook = searchingBook.setBookForCompare("Son", "Taras", "Shevchenko", Country.UKRAINE);

//        for (String carrentAddress: libraryService.getAddressOfLibraries(searchingBook)){
//            System.out.println(carrentAddress);
//        }
        Person person1 = new Person(1,"Vasyl", "Petrenko", Country.SPAIN);

        Author searchingAuthor = new Author("Taras", "Shevchenko", Country.UKRAINE);
        Author searchingAuthor2 = new Author("Bruce", "Eckel", Country.USA);

        try {
            for (Library library : libraryService.getListOfLybrariesByAuthor(searchingAuthor, searchingAuthor)) {
                System.out.println((library.getnumbersOfBook(searchingBook)));

//                library1.getBook(person1, searchingBook);
//                System.out.println((library.getnumbersOfBook(searchingBook)));
//                library1.returnBook(person1,searchingBook);
//                System.out.println((library.getnumbersOfBook(searchingBook)));
//                library1.returnBook(person1,searchingBook);
                return;
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }



    }
}

