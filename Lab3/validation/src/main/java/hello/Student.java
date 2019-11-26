package hello;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import validator.country.CountryValidator;
import validator.type.TypeValidator;
import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull(message = "Pole nie może być puste!")
    @Size(min=2, max=30, message = "Pole musi zawierać od 2 do 30 znaków!")
    private String name;

    @NotNull(message = "Pole nie może być puste!")
    @Min(value = 17, message = "Wiek minimalny to 17 lat!")
    @Max(value = 25, message = "Wiek maksymalny to 25 lat!")
    private Integer age;

    @NotNull(message = "Pole nie może być puste!")
    @TypeValidator
    private String type;

    @NotNull(message = "Pole nie może być puste!")
    @CountryValidator
    private String country;

    public  Student()
    {
        super();
    }

    public Student(int id, String name, Integer age, String type, String country)
    {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
        this.country = country;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
}
