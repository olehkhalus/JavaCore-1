package com.hw.hw2.person;

import java.time.Year;

public class Person {
    
    private String name;
    private int birthYear;
    
    public Person() {}
    
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }
    
    public String toString() {
        return String.format("Person [name='%s', age=%s]", name, getAge());
    }
}

