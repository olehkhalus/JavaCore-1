package hibernate;

import org.hibernate.Session;
import java.util.List;

public class CRUDOperations {

    public int save(Object object) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        int id = (int) session.save(object);
        session.getTransaction().commit();
        session.close();
        return id;
    }

    public List<Object> read(String string){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        List objects = session.createQuery(string).list();
        session.close();
        return objects;
    }

    public Object update(Object object){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.merge(object);
        session.getTransaction().commit();
        session.close();
        return object;
    }

    public void delete(Object object){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(object);
        session.getTransaction().commit();
        session.close();
    }

}
