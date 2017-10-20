package com.hw.hw5.person;

public class Student extends Person {
    public static final String TYPE_PERSON = "Student";
    
    public Student() {    }

    public Student(String name) {
        super(name);
    }

    public String print() {
        return String.format("My name's '%s', I'm a %s.", name, TYPE_PERSON);
    }
}