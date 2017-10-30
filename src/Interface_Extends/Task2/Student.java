package Interface_Extends.Task2;

public class Student extends Person {
    private String TYPE_PERSON = "Student";
   public Student (String name){
       super(name);
   }


    @Override
    public String print() {
        return String.format("I am a ", name, TYPE_PERSON);
    }
}
