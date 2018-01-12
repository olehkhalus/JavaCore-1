package hibernate;

import model.Book;
import model.Person;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class PersonDao {
    public void addToList(Person person, Book book){
        BookDao bookDao = new BookDao();
        if(isPersonIn(person)){
            person.setId(getIdPerson(person));
        }
        bookDao.getIdBook(book);
        person.getBooks().add(book);
        new CRUDOperations().update(person);
    }

    public Boolean isPersonIn (Person person){
        Boolean isPerson = true;
        Query query;
        String hql = "select distinct b from Person b " +
                "where b.firstName in :firstName" +
                " and b.lastName in :lastName" +
                " and b.country in :country";
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        query = session.createQuery(hql);
        query.setParameter("firstName", person.getFirstName());
        query.setParameter("lastName", person.getLastName());
        query.setParameter("country", person.getCountry());
        List<Integer> persons= query.list();
        session.close();
        if (persons.isEmpty()){
            isPerson = false;
        }
        return  isPerson;
    }

    public Integer getIdPerson (Person person){
        Integer id = null;
        Query query;
        String hql = "select distinct b from Person b " +
                "where b.firstName in :firstName" +
                " and b.lastName in :lastName" +
                " and b.country in :country";
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        query = session.createQuery(hql);
        query.setParameter("firstName", person.getFirstName());
        query.setParameter("lastName", person.getLastName());
        query.setParameter("country", person.getCountry());
        List<Person> persons = query.list();
        session.close();
        for (Person currentPerson: persons)
            if (!persons.isEmpty()){
                id = currentPerson.getId();
            }
        return  id;
    }

    public List<Book> getListBook(Person person){
        Person person1 = new Person();
        if(person.getId()== null){
            person.setId(getIdPerson(person));
        }
        Query query;
        String hql = "select distinct p from Person p join p.books b"+
                " where p.id = :id ";
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        query = session.createQuery(hql);
        query.setParameter("id", person.getId());
        List<Person> personList = query.list();
        person1 = personList.iterator().next();
        System.out.println(person1);
        session.close();
        return person1.getBooks();
    }

    public Boolean removeFromList(Person person, Book book) {
        List<Book> books = getListBook(person);
        if (books.contains(book)) {
            books.remove(book);
            person.setBooks(books);
            new CRUDOperations().update(person);
            return true;
        } else {
            return false;
        }
    }


}
