package hibernate;


//import com.fasterxml.classmate.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.io.File;

public class HibernateSessionFactory {
  /*  private static SessionFactory sessionFactory;

    static{
            try{
                sessionFactory = new Configuration().configure("C:\\Users\\User\\IdeaProjects\\Books\\src\\main\\resources\\hibernate.cfg.xml").buildSessionFactory();

            }catch (Throwable ex) {
                System.err.println("Session Factory could not be created." + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }

*/
  private static final SessionFactory sessionFactory;

    //private static ServiceRegistry serviceRegistry;

    static {
        try {
            StandardServiceRegistry standardRegistry =
                    new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
            Metadata metaData =
                    new MetadataSources(standardRegistry).getMetadataBuilder().build();
            sessionFactory = metaData.getSessionFactoryBuilder().build();
        } catch (Throwable th) {

            System.err.println("Enitial SessionFactory creation failed" + th);
            throw new ExceptionInInitializerError(th);

        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
}
