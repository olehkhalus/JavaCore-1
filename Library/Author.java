public class Author {
    String name;
    String surname;
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

    public boolean equals(Author author){
        if(author.getName().equals(this.getName()) && author.getSurname().equals(this.getSurname())){
            return true;
        }
        else {
            return false;
        }
    }
}
