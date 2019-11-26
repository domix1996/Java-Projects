package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        SessionFactory sessionFactory = null;

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<Person> Persons = Arrays.asList(
                new Person("LFS100638", "Poppy", "Murphy"),
                new Person("YAB939875", "Terry", "Rivera"),
                new Person("EVJ325374", "Catherine", "Flores"),
                new Person("ZYK342831", "Michelle", "Castillo"),
                new Person("PWB170077", "Bryan", "Adams"),
                new Person("WVO771075", "Wayne", "Wright"),
                new Person("SHN438830", "Leonard ", "Clark")
        );

        session.save(new Hotel(Persons));
        session.getTransaction().commit();
        session.close();

        session = sessionFactory.openSession();
        session.beginTransaction();

        List result = session.createQuery("from Hotel").list();
        for ( Hotel i : (List<Hotel>) result ) {
            System.out.println( "Hotel " + i.id);
            for (Person j: i.Persons) {
                System.out.println(MessageFormat.format("Person {0}, {1}, {2}, {3}", j.id, j.IDCard, j.firstName, j.lastName));
            }
        }
        session.getTransaction().commit();
        session.close();

        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }
}