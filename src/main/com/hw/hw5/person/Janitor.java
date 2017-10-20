package com.hw.hw5.person;

public class Janitor extends Staff {
    public static final String TYPE_PERSON = "Janitor";
    
    public Janitor() {    }

    public Janitor(String name, double salary) {
        super(name, salary);
    }

    public double getSalary() {
        return salary;
    }
    
    public String print() {
        return String.format("My name's '%s', I'm a %s. I make %.2f a month", name, TYPE_PERSON, getSalary());
    }
} 


