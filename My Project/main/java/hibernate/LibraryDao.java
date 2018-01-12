package hibernate;

import SQL.libraries;
import model.Author;
import model.Book;
import model.Library;
import model.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import service.BookService;
import service.PersonService;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryDao {

    public void addBookLibrary(Library library) {
        addIdLibrary(library);
        if (!library.getBooks().isEmpty()) {
            setIdBook(library);
        }
        new CRUDOperations().update(library);
    }

    private void addIdLibrary(Library library) {
        Integer id = null;
        Query query;
        String hql = "select distinct l from Library l " +
                "where l.address in :address";
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        query = session.createQuery(hql);
        query.setParameter("address", library.getAddress());
        List<Library> libraries = query.list();
        session.close();
        if (!libraries.isEmpty()) {
            id = libraries.iterator().next().getiDLibrary();
            library.setiDLibrary(id);
        }
    }

    private void setIdBook(Library library) {
        BookDao bookDao = new BookDao();
        for (Book currentBook : library.getBooks()) {
            if (bookDao.isExistsBook(currentBook)) {
                currentBook.setId(bookDao.getIdBook(currentBook));
            } else {
                new CRUDOperations().save(currentBook);
                currentBook.setId(bookDao.getIdBook(currentBook));
            }
        }
    }

    public Set<Book> getAllBooks(Library library) {
        Query query;
        String hql = "select distinct l from Library l " +
                "join l.mapBooksAndCount m " +
                "where l.address in :address";
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        query = session.createQuery(hql);
        query.setParameter("address", library.getAddress());
        List<Library> libraries = query.list();
        Library library1 = (Library) libraries.iterator().next();
        session.close();
        return library1.getMapBooksAndCount().keySet();
    }

    private Map<Book, Integer> getMapBooksAndCount(Library library) {
        Query query;
        String hql = "select distinct l from Library l " +
                "join l.mapBooksAndCount m " +
                "where l.address in :address";
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        query = session.createQuery(hql);
        query.setParameter("address", library.getAddress());
        List<Library> libraries = query.list();
        Library library1 = (Library) libraries.iterator().next();
        session.close();
        return library1.getMapBooksAndCount();
    }

    public void delBookFromLibrary(Integer idLibrary, Book book) {
        Query query;
        BookDao bookDao = new BookDao();
        if (bookDao.isExistsBook(book)) {
            book.setId(bookDao.getIdBook(book));
            for (Author a : book.getAuthors()) {
                a.setId(bookDao.getIdAuthor(a));
            }
        } else {
            return;
        }
        String hql = "select distinct l from Library l " +
                "join l.mapBooksAndCount m " +
                "where l.id in :id";
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        query = session.createQuery(hql);
        query.setParameter("id", idLibrary);
        List<Library> libraries = query.list();
        Library library1 = (Library) libraries.iterator().next();
        session.close();
        Map<Book, Integer> map = library1.getMapBooksAndCount();
        map.remove(book);
        library1.setMapBooksAndCount(map);
        new CRUDOperations().update(library1);
    }

    public List<Book> isBooksByAuthorInLibrary(Library library, Author author) {
        BookDao bookDao = new BookDao();
        List<Book> books = new ArrayList<>();
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            if (bookDao.isAuthorIn(author)) {
                author.setId(bookDao.getIdAuthor(author));
                String sql = "select * from table_libraries l join libraries_books " +
                        "using (id_library) join books b using (id_book) join relations using (id_book) " +
                        "join authors a using (id_author) where id_author = :id and l.address = :address";
                NativeQuery nativeQuery = session.createNativeQuery(sql);
                nativeQuery.setParameter("id", author.getId());
                nativeQuery.setParameter("address", library.getAddress());
                books = nativeQuery.addEntity(Book.class).list();
                session.close();
            }
        }
        return books;
    }

    public Boolean isBookInLibrary(Library library, Book book) {
        List<Book> books = new ArrayList<>();
        class FLName {
            String f;
            String l;
        }
        List<FLName> ss = book.getAuthors().stream().map(author -> {
            FLName fLName = new FLName();
            fLName.f = author.getFirstName();
            fLName.l = author.getLastName();
            return fLName;
        }).collect(Collectors.toList());
        for (FLName curr : ss) {
            try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
                String sql = "select * from table_libraries l join libraries_books " +
                        " using (id_library) join books b using (id_book) join relations using (id_book) " +
                        " join authors a using (id_author) where a.firstname = :firstName " +
                        " AND a.lastname = :lastName " +
                        " AND b.book_name = :bookname " +
                        " AND l.address = :address ";
                NativeQuery nativeQuery = session.createNativeQuery(sql);
                nativeQuery.setParameter("address", library.getAddress());
                nativeQuery.setParameter("firstName", curr.f);
                nativeQuery.setParameter("lastName", curr.l);
                nativeQuery.setParameter("bookname", book.getName());
                books = nativeQuery.addEntity(Book.class).list();
                session.close();
            }
        }
        return !books.isEmpty();
    }



    public List<Library>librariesWithBook(Book searchingBook){
        BookDao bookDao = new BookDao();
        List<Library> libraries = new ArrayList<>();
        if(bookDao.isExistsBook(searchingBook)) {
            searchingBook.setId(bookDao.getIdBook(searchingBook));
            Query query;
            String hql = "select distinct l from Library l " +
                    "join l.mapBooksAndCount m where key(m).id = :id";
            Session session = HibernateSessionFactory.getSessionFactory().openSession();
            query = session.createQuery(hql);
            query.setParameter("id", searchingBook.getId());
            libraries = query.list();
            session.close();
        }
        return libraries;
    }

    public void getBook(Library library, Person person, Book book) {
            book.setId(new BookDao().getIdBook(book));
            Map<Book, Integer> map = getMapBooksAndCount(library);
            map.put(book, (map.get(book)-1));
            library.setMapBooksAndCount(map);
            new CRUDOperations().update(library);
            new PersonDao().addToList(person, book);
    }


    public  void returnBook(Library library, Person  person, Book book) {
        Map<Book, Integer> map = getMapBooksAndCount(library);
        if (new PersonDao().removeFromList(person, book)) {
            Integer quantity = map.get(book);
            map.put(book, quantity+1);
            library.setMapBooksAndCount(map);
            new CRUDOperations().update(library);
        } else {
            System.err.println("You don't have this book, you can't return it");
        }
    }
}
