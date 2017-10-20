package com.hw.hw5.person;

public abstract class Person {
    
    protected String name;

    public Person() {
        this("UNKNOWN");
    }
    
    public Person(String name) {
        this.name = name;
    }

    public abstract String print(); 

}