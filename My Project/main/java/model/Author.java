package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "authors")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Author {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id_author")
    private Integer id;

    @Column (name = "firstname")
    private String firstName;

    @Column (name = "lastname")
    private String lastName;

    @Column(name="country")
    @Enumerated(EnumType.ORDINAL)
    private Country country;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Country getCountry() {return country;}

    public Author(){}

    public Author(String firstName, String lastName, Country country){
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setCountry(Country country) { this.country = country;  }

    public void setCountry2(String text){
        country = Country.valueOf(text.toUpperCase());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id) &&
                Objects.equals(firstName, author.firstName) &&
                Objects.equals(lastName, author.lastName) &&
                country == author.country;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, lastName, country);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country=" + country +
                '}';
    }
}
