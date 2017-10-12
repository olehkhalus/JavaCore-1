import java.util.*;
public class Person {
    private String name;
    private int birthYear;
    private int age;
    Calendar cal=Calendar.getInstance();
    public Person(){}
    public Person(String name, int birthYear){
        this.name=name;
        this.birthYear=birthYear;
        this.age=cal.get(Calendar.YEAR)-birthYear;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getYear(){
        return birthYear;
    }
    public void setYear(int birthYear){
        this.birthYear=birthYear;
    }
    public void input(String name, int birthYear){
        this.name=name;
        this.birthYear=birthYear;
    }
    public void output(){
        System.out.println(this.toString());
    }
    public int age(){
        this.age=cal.get(Calendar.YEAR)-birthYear;
        return age;
    }
    @Override
    public String toString(){
        return "Person [name = "+name+", age = "+age+"]";
    }
    public static void main(String[] args){
        Person person1=new Person("Stas", 1999);
        Person person2=new Person("Vitya", 1973);
        Person person3=new Person();
        person3.input("Oleg", 2001);
        Person person4=new Person("Yulia",1991);
        Person person5=new Person("Sveta",1980);

    }

}
