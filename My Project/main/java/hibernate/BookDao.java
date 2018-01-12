package hibernate;

import model.Author;
import model.Book;
import org.hibernate.Session;
import org.hibernate.query.Query;
import service.BookService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookDao {

    public Integer getIdAuthor (Author author){
        Integer id = null;
        Query query;
        String hql = "select distinct b from Author b " +
                "where b.firstName in :firstName" +
                " and b.lastName in :lastName" +
                " and b.country in :country";
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        query = session.createQuery(hql);
        query.setParameter("firstName", author.getFirstName());
        query.setParameter("lastName", author.getLastName());
        query.setParameter("country", author.getCountry());
        List<Author> authors = query.list();
        session.close();
        for (Author currentAuthor: authors)
            if (!authors.isEmpty()){
                id = currentAuthor.getId();
            }
        return  id;
    }

    public Boolean isAuthorIn (Author author){
        Boolean isAuthor = true;
        Query query;
        String hql = "select distinct b from Author b " +
                "where b.firstName in :firstName" +
                " and b.lastName in :lastName" +
                " and b.country in :country";
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        query = session.createQuery(hql);
        query.setParameter("firstName", author.getFirstName());
        query.setParameter("lastName", author.getLastName());
        query.setParameter("country", author.getCountry());
        List<Integer> authors = query.list();
        session.close();
        if (authors.isEmpty()){
            isAuthor = false;
        }
        return  isAuthor;
    }

    public Book getBook(Integer iD){
        String hql = "select distinct b from Book b " +
                "join b.authors a " +
                "where b.id in :iD";
        Query query;
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        query = session.createQuery(hql);
        query.setParameter("iD", iD);
        List<Book> books = query.list();
        session.close();
        Book book = books.iterator().next();
        return book;
    }

    public List <Book> getBooks(Author author){
        String hql = "select distinct b from Book b " +
                "join b.authors a " +
                "where a.firstName in :firstName" +
                " and a.lastName in :lastName" +
                " and a.country in :country";
        Query query;
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        query = session.createQuery(hql);
        query.setParameter("firstName", author.getFirstName());
        query.setParameter("lastName", author.getLastName());
        query.setParameter("country", author.getCountry());
        List<Book> books = query.list();
        session.close();
        return books;
    }

    public List<Book> getBookByPartOfName( String partOfBookName){
        String hql = "select distinct b from Book b " +
                "join b.authors a " +
                "where b.name like :bookName";
        Query query;
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        query = session.createQuery(hql);
        query.setParameter("bookName", "%"+partOfBookName.toLowerCase()+"%");
        List<Book> books = query.list();
        session.close();
        return books;
    }

    public List<Book> getBooksByPartOfAuthorName(String partOfName){
        String hql = "select distinct b from Book b " +
                "join b.authors a " +
                "where a.firstName like :firstName" +
                " or a.lastName like :lastName";
        Query query;
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        query = session.createQuery(hql);
        query.setParameter("firstName", "%"+partOfName+"%");
        query.setParameter("lastName", "%"+partOfName+"%");
        List<Book> books = query.list();
        session.close();
        return books;
    }

    public List<Book> getAllBooks(){
        List<String> strings = Arrays.asList("Bruce3", "Bruice1");
        String hql = "select distinct b from Book b " +
                "join b.authors a " +
                "where a.firstName in :strings";
        Query query;
        List<Book> books;
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();
            query = session.createQuery(hql);
            query.setParameter("strings", strings);
            books = query.list();
            System.out.println(books);
        }
        return books;
    }

    public boolean isExistsBook(Book book){
        class FLName{
            String f;
            String l;
        }
        List<String> strings = new BookService().getNames(book);
        List<FLName> ss = book.getAuthors().stream().map(author -> {FLName fLName = new FLName();
            fLName.f = author.getFirstName();
            fLName.l = author.getLastName();
            return fLName;}).collect(Collectors.toList());
        Query query;
        List<Book> books = new ArrayList<>();
        for (FLName curr : ss) {
            String hql = "select distinct b from Book b " +
                    " join b.authors a " +
                    "where a.firstName in :firstName and " +
                    " a.lastName in :lastName and " +
                    " b.name in :name";
            try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
                session.beginTransaction();
                query = session.createQuery(hql);
                query.setParameter("firstName", curr.f);
                query.setParameter("lastName", curr.l);
                query.setParameter("name", book.getName());
                books = query.list();
            }
        }
        return !books.isEmpty();
    }
    public Integer getIdBook(Book book){
        class FLName{
            String f;
            String l;
        }
        List<String> strings = new BookService().getNames(book);
        List<FLName> ss = book.getAuthors().stream().map(author -> {FLName fLName = new FLName();
            fLName.f = author.getFirstName();
            fLName.l = author.getLastName();
            return fLName;}).collect(Collectors.toList());
        Query query;
        List<Book> books = new ArrayList<>();
        for (FLName curr : ss) {
            String hql = "select distinct b from Book b " +
                    " join b.authors a " +
                    "where a.firstName in :firstName and " +
                    " a.lastName in :lastName and " +
                    " b.name in :name";
            try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
                session.beginTransaction();
                query = session.createQuery(hql);
                query.setParameter("firstName", curr.f);
                query.setParameter("lastName", curr.l);
                query.setParameter("name", book.getName());
                books = query.list();
            }
        }
        return books.iterator().next().getId();
    }

    public boolean addBook(Book book) {
        CRUDOperations crudOperations = new CRUDOperations();
        if (isExistsBook(book)) {
            return false;
        } else {
            for (Author author : book.getAuthors()) {
                if (!isAuthorIn(author)) {
                    crudOperations.save(author);
                } else {
                    new BookService().updateAuthor(book, author);
                }
            }
            crudOperations.update(book);
        }
        return true;
    }
}
