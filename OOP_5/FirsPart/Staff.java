abstract public class Staff extends Person {

    public Staff(String name) {
        super(name);
    }
    @Override
    String print() {
        return "I am a "+this.name;
    }
    abstract int salary();
}
