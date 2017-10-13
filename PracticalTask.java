package com.veboro;

import java.util.Calendar;
import java.util.Scanner;


public class PracticalTask {

public static void main(String[] args) {
        Person person1 = new Person();
        person1.input();
        person1.output();

        Person person2 = new Person();
        person2.input();
        person2.output();

        Person person3 = new Person();
        person3.input();
        person3.output();

        Person person4 = new Person();
        person4.input();
        person4.output();

        Person person5 = new Person();
        person5.input();
        person5.output();
        }
}

//Creating new class com.veboro.Person
class Person {

    //Adding private fields
    private String name;
    private int birthYear;


    //Default constructor
    public Person() {

    }
    //Constructor with parameters
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }


    //Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    Scanner scanner = new Scanner(System.in);

   //calculate the age of person
    int age (int age){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        if (this.birthYear == 0){
            System.out.println("Enter you year of birth: ");
            try {
                setBirthYear(scanner.nextInt());
            } catch (Exception e){
                System.err.println("Int only");
            }

        }

        int yourAge = year-this.birthYear;
        return yourAge;

    }
    //input information about person
    void input(){
        System.out.println("Your name: ");
        setName(scanner.nextLine());
        System.out.println("Your birth of age: ");
        try{
            setBirthYear(scanner.nextInt());
        } catch (Exception e) {
            System.err.println("Int only");
        }


    }

    //output information about person
    void output(){
        System.out.println("Your name is "+getName());
        System.out.println("Your are "+age(this.birthYear)+" years old");

    }

    //change the name of person
    void changeName(){
        System.out.println("Enter new name: ");
        setName(scanner.nextLine());

    }

}