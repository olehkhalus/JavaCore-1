package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="person")
//@AttributeOverrides({
//        @AttributeOverride(name="firstName", column=@Column(name="firstname")),
//        @AttributeOverride(name="lastName", column=@Column(name="lastname")),
//        @AttributeOverride(name="country", column=@Column(name="country"))
//
//})
public class Person extends Author {
     @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "person_book",
            joinColumns = { @JoinColumn(name = "id") },
            inverseJoinColumns = { @JoinColumn(name = "id_book") }
    )
     private List<Book> books=new ArrayList<>();
//   @Id
//   @GeneratedValue (strategy = GenerationType.AUTO)
//   @Column (name = "id_person")
//    private Integer id;

    public Person(){}
    public Person( String firstName, String lastName, Country countryEnum){
        super( firstName, lastName, countryEnum);
    }

    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return Objects.equals(books, person.books);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), books);
    }

    @Override
    public String toString() {
        return "Person{" +
                "books=" + books +
                '}';
    }
}
