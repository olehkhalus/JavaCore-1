/*Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
1)surnames and initials
2)name
3)name, middle name and last name*/

public class Person {
    private String surname;
    private String name;
    private String patronymic;
    public Person(){}
    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }
    public Person(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public void outputSurnameWithInit(){
        String str=this.getSurname()+" "+this.getName().substring(0,1)+". "+this.getPatronymic().substring(0,1)+".";
        System.out.println(str);
    }
    public void outputName(){
        String str=this.getName();
        System.out.println(str);
    }
    public void outputFullName(){
        String str=this.getSurname()+" "+this.getName()+" "+this.getPatronymic();
        System.out.println(str);
    }
    public static void main(String... args){
Person person=new Person("Kindrachuk","Stanislav","Victorovych");
person.outputSurnameWithInit();
person.outputFullName();
person.outputName();
    }
}
