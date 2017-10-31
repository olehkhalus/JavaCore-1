
public class Student extends Person {
final private String TYPE_PERSON = "student";
    public Student(String name) {
        super(name);
        System.out.println(TYPE_PERSON);
    }

    @Override
    String print() {
        return "I am a "+name;
    }
}
