package hometask2;

import java.time.Year;

public class Person {
    private String name;
    int birthYear;

    public Person() {

    }
  /*  public static LocalDate now(){

    }*/

    public Person(String name, int birthYear) {
        this.birthYear = birthYear;
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;

    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    public String toString() {
        return String.format("Person [name='%s', age=%s]", getName(), getAge());
    }
}
