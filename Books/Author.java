package Books;

public class Author {
    private String firstName;
    private String lastName;
    private Country country;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author(String firstName, String lastName, Country country){
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
    }
}
