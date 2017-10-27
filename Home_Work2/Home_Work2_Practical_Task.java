//Create Console Application project in Java.
//Add class Employee to the project.
//        Class Employee should consists of
//       three private fields: name, rate and hours;
//static field totalHours
//        properties for access to these fields;
//default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
//        methods:
//        salary - to calculate the salary of person (rate * hours)
//        toString - to output information about employee
//        changeRate - to change the rate of employee
//        bonuses – to calculate % from salary
//        In the method main() create 3 objects of Employee type. Input information about them.
//        Display the total hours of all workers to screen

package Home_Work2;

import java.util.Calendar;
import java.util.Scanner;

class Person {
    private String Name;
    private int Date_of_birth;

    // constructors

    public Person () {
    }
    public Person (String name , int age) {
        this.Name = Name;
        this.Date_of_birth = Date_of_birth ;
    }

    // getters and setters

    void setName(String Name) {
        this.Name = Name;
    }
    String getName () {
        return Name;
    }


    void setDate_of_birth(int Date_of_birth) {
        this.Date_of_birth = Date_of_birth;
    }
    int getDate_of_birth () {
        return Date_of_birth;
    }

    //methods

    void input () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Person name:");
        setName(scanner.nextLine());
        System.out.println("Enter Person date of birth:");
        setDate_of_birth(scanner.nextInt());
    }

    int getAge () {
        int current_year = Calendar.getInstance().get(Calendar.YEAR);
        return current_year-Date_of_birth;
    }

    void output() {
        System.out.println("Person name "+getName());
        System.out.println("Person date of birth: "+getDate_of_birth());
        System.out.println("Person age: "+getAge());
    }

    void changeName () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Person name");
        setName(scanner.nextLine());
    }






}

public class Home_Work2_Practical_Task {
    public static void main(String Args[]) {
        Person person1 = new Person() ;
        person1.input();
        person1.output();
        Person person2 = new Person() ;
        person2.input();
        person2.output();
        Person person3 = new Person() ;
        person3.input();
        person3.output();
        Person person4 = new Person() ;
        person4.input();
        person4.output();
        Person person5 = new Person() ;
        person5.input();
        person5.output();
    }
}
