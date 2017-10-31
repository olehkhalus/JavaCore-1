package Interface_Extends.Task2;

public class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";



    public Teacher(String name, int hours, double wage) {
        super(name, hours, wage);
    }

    public double getSalary() {
        return hours * wage;
    }

    public String print() {
        return String.format("My name's '%s', I'm a %s. I make %.2f a month", name, TYPE_PERSON, getSalary());
    }
}
