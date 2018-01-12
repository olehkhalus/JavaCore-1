package main;
//import JDBC.BookDao;
import hibernate.*;
import model.*;
import org.hibernate.Session;
import service.*;

import java.util.*;

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
        libraryMap1.put(javaPhilosophy, 5);
        libraryMap1.put(master, 2);
        libraryMap1.put(dogHeart, 1);

        Map<Book, Integer> libraryMap2 = new HashMap<>();
        libraryMap2.put(kobzar, 1);
        libraryMap2.put(zapovit, 3);
        libraryMap2.put(kavkaz, 1);
        libraryMap2.put(javaPhilosophy, 2);
        libraryMap2.put(dogHeart, 2);

        Map<Book, Integer> libraryMap3 = new HashMap<>();
        libraryMap3.put(kobzar, 5);
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


//        System.out.println(libraryService.listOfLibrariesWithSearchingBook(searchingBook));
//        for (String carrentAddress: libraryService.getAddressOfLibraries(searchingBook)){
//            System.out.println(carrentAddress);
//        }

        Person person1 = new Person("Vasyl", "Petrenko", Country.SPAIN);

        Author searchingAuthor = new Author("Taras", "Shevchenko", Country.UKRAINE);
        Author searchingAuthor2 = new Author("Bruce", "Eckel", Country.USA);
        ArrayList<Author>authors = new ArrayList<>();
//        authors.add(searchingAuthor);
//        authors.add(searchingAuthor2);
        authors.add(bulgakov);

//       try {
//            for (Library library : libraryService.getLybrariesByAuthor(searchingAuthor2, searchingAuthor)) {
//                System.out.println((library.getcountOfBook(searchingBook)));
//
////                library1.getBook(person1, searchingBook);
////                System.out.println((library.getcountOfBook(searchingBook)));
////                library1.returnBook(person1,searchingBook);
////                System.out.println((library.getcountOfBook(searchingBook)));
////                library1.returnBook(person1,searchingBook);
//                return;
//            }
//        } catch (Exception ex) {
//            System.err.println(ex);
//        }
        /*
        Person person2 = new Person(1,"Andry", "Juck", Country.UK);
        Person person3 = new Person(1,"Tanas", "Kozak", Country.USA);
        Person person4 = new Person(1,"Ivan", "Kozak", Country.USA);

        Feedback feedback1 = new Feedback(5,"Very good book", true);
        Feedback feedback2 = new Feedback(4,"Nice good book", true);
        Feedback feedback3 = new Feedback(1,"Not good book", false);
        Feedback feedback4 = new Feedback(0, "Very bad", false);

        FeedbackBookPerson feedbackBookPerson1 = new FeedbackBookPerson(person1 ,feedback1, kobzar);
        FeedbackBookPerson feedbackBookPerson2 = new FeedbackBookPerson(person2 ,feedback2, kobzar);
        FeedbackBookPerson feedbackBookPerson3 = new FeedbackBookPerson(person3 ,feedback3, kobzar);
        FeedbackBookPerson feedbackBookPerson4 = new FeedbackBookPerson(person4 ,feedback1, kobzar);
        FeedbackBookPerson feedbackBookPerson5 = new FeedbackBookPerson(person1 ,feedback1, kavkaz);
        FeedbackBookPerson feedbackBookPerson6 = new FeedbackBookPerson(person2 ,feedback1, kavkaz);
        FeedbackBookPerson feedbackBookPerson7 = new FeedbackBookPerson(person3, feedback4, kavkaz);
        FeedbackBookPerson feedbackBookPerson8 = new FeedbackBookPerson(person4, feedback3, kavkaz);
        FeedbackBookPerson feedbackBookPerson9 = new FeedbackBookPerson(person1, feedback2, dogHeart);
        FeedbackBookPerson feedbackBookPerson10 = new FeedbackBookPerson(person4, feedback1, dogHeart);

        library1.getListFeedbackBookPerson().add(feedbackBookPerson1);
        library1.getListFeedbackBookPerson().add(feedbackBookPerson2);
        library1.getListFeedbackBookPerson().add(feedbackBookPerson3);
        library1.getListFeedbackBookPerson().add(feedbackBookPerson4);
        library1.getListFeedbackBookPerson().add(feedbackBookPerson5);
        library1.getListFeedbackBookPerson().add(feedbackBookPerson6);
        library1.getListFeedbackBookPerson().add(feedbackBookPerson7);
        library1.getListFeedbackBookPerson().add(feedbackBookPerson8);
        library1.getListFeedbackBookPerson().add(feedbackBookPerson9);
        library1.getListFeedbackBookPerson().add(feedbackBookPerson10);

        System.out.println(library1.mapOfBookRating());
        System.out.println(library1.getHiRatingBook(library1.mapOfBookRating()));
        System.out.println(); */



//        System.out.println(new BookMaker().getBooks(shevchenko));
//        System.out.println(new BookMaker().allBoksByAuthors(eckel,shevchenko));
//        new BookMaker().addAuthorToBase(shevchenko);
//        new BookMaker().addBook(javaPhilosophy);
//          new BookMaker().addBook(kobzar);
//        Author pushkin = new Author("Alex", "Pushkin", Country.RUSSIA);
//          new BookMaker().addAuthorToBase(pushkin);
//        System.out.println("insert INTO books (book_name) VALUES (\""+kavkaz.getName()+"\");");
//        new BookMaker().addBook(son);


//        System.out.println(CRUDOperations.save(gogol));

//        System.out.println(CRUDOperations.read("from Author"));
       // CRUDOperations.save(bulgakov);
        //CRUDOperations.save(dogHeart);
//        CRUDOperations.getAllBooks();
       // CRUDOperations.isAuthorInTable(bulgakov);
//        CRUDOperations.addBook(zapovit);
//        System.out.println(CRUDOperations.isAuthorInBook(bulgakov));
//        System.out.println(CRUDOperations.isExistsBook(kavkaz));

//        System.out.println(CRUDOperations.getBookByPartOfName("vit"));
       // System.out.println(crudOperations.getBooksByPartOfAuthorName("sHevCh"));

//        ArrayList<Author> authors1 = new ArrayList<>();
//        authors1.add(eckel);
//        Book book1 = new Book("Zapovit", authors1);
//        crudOperations.addBook(dogHeart);

        Library library0 = new Library();
        library0.setAddress("Golovna, 200");
        HashMap<Book, Integer> map = new HashMap<>();
        map.put(zapovit, 2);
        map.put(son, 1);
        library0.setMapBooksAndCount(map);
//        for (Book b: new LibraryDao().getAllBooks(library0)){
//            System.out.println(b);
//        for(Library l: new LibraryDao().librariesWithBook(zapovit)){
//            System.out.println(l.getAddress());
//        }
//        for (Book b: new LibraryDao().isBooksByAuthorInLibrary(library2, shevchenko)){
//            System.out.println(b);
//        }

//        new LibraryDao().delBookFromLibrary(1, son);
        new LibraryDao().addBookLibrary(library2);
        Person person = new Person();
        person.setFirstName("Igor");
        person.setLastName("Ivanov");
        person.setCountry(Country.UKRAINE);
//        son.setId(22);
        LibraryDao libraryDao = new LibraryDao();
//        libraryDao.getBook(library2, person, new BookDao().getBook(1));
//        libraryDao.returnBook(library2, person, new BookDao().getBook(1));
        new PersonDao().getListBook(person);
    }
}

