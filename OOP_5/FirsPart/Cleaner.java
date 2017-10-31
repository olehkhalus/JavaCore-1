
public class Cleaner extends Staff {
    final private String TYPE_PERSON = "cleaner";

    public Cleaner(String name) {
        super(name);
        System.out.println(TYPE_PERSON);
    }

    @Override
    String print() {
        return "I am a "+name;
    }

    @Override
    int salary() {
        return 200;
    }
}

