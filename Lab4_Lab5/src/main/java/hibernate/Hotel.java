package hibernate;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    public int id;

    @OneToMany(targetEntity = Person.class, cascade = {CascadeType.ALL})
    public List<Person> Persons;

    public Hotel(List<Person> Persons) {
        this.Persons = Persons;
    }
    public Hotel() { }
}