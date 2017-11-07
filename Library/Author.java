public class Author {
    private String name;
    private String surname;
    public Author(){}
    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
    
    @Override
    public boolean equals(Object objAuthor){
        Author author = (Author) objAuthor;
        return author.getName().equals(this.getName()) && author.getSurname().equals(this.getSurname());
    }
}
