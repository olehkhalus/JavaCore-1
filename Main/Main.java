package Main;
import Books.*;

import java.util.ArrayList;

public class Main {
    public static void main(String...args){
        ArrayList<Library> libraries = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Book> books1 = new ArrayList<>();
        Author shevchenko = new Author("Taras", "Shwvchenko", Country.UKRAINE);
        ArrayList<Author> arrayShevchenko=new ArrayList<>();
        arrayShevchenko.add(shevchenko);
        Book kobzar = new Book("Kobzar", arrayShevchenko);
        Book zapovit = new Book("Zapovit", arrayShevchenko);
        Book son = new Book("Son", arrayShevchenko);
        Book kavkaz = new Book("Kavkaz", arrayShevchenko);
        Author eckel = new Author("Bruce", "Eckel", Country.USA);
        ArrayList<Author> arrayAckel= new ArrayList<>();
        arrayAckel.add(eckel);
        ArrayList<Author> eckelAndShevchenko = new ArrayList<>();
        eckelAndShevchenko.add(eckel);
        eckelAndShevchenko.add(shevchenko);
        Book javaPhilosophy = new Book("Java philosophy", eckelAndShevchenko);
        Author bulgakov = new Author("Myhail", "Bulgakov", Country.UKRAINE);
        ArrayList<Author> arrayBulg = new ArrayList<>();
        arrayBulg.add(bulgakov);
        Book master = new Book("Master y margaryta",arrayBulg);
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

        Library library1 = new Library(books, 9, 00, 22, 00, "Chernivtsi, Golovna str., 200");
        Library library2 = new Library(books,8,00, 23, 00,"Chernivtsi, Golovna str., 100");
        Library library3 = new Library(books1,8,00, 20,00,"Chernivtsi, Golovna str., 10");

        libraries.add(library1);
        libraries.add(library2);
        libraries.add(library3);
        ArrayList<Library> librariesVsSearchingBook = new ArrayList<>();
        LibraryService libraryService =new LibraryService(libraries,librariesVsSearchingBook);


        libraryService.listOfLibrariesVsSearchingBook("Kavkaz");
        libraryService.getAddressOfNecessaryLibrary();

        libraryService.fillTheMapOfLybrariesByAuthor("Myhail", "Bulgakov");
        libraryService.printAllAddressLibrariesBySearchingAuthor();



    }
}
