package hibernate;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    int id;

    String IDCard;
    String firstName;
    String lastName;

    public Person() { }

    public Person(String IDCard, String firstName, String lastName) {
        this.IDCard = IDCard;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
