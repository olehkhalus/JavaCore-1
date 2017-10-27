package com.hw.hw7.person;

import java.util.List;
import java.util.ArrayList;

public class PersonUtil {
    private final List<Person> person = new ArrayList<>();

    public void add(String name, String surname) {
        person.add(new Person(name, surname));
    }

    public void remove(String name, String surname) {
        for (int i = 0; i < person.size(); i++) {
            if ((name.equals(person.get(i).getName()) && (surname.equals(person.get(i).getSurname())))) {
                person.remove(i);    
            }
        }
    }

   public void print() {
        person.forEach(p -> System.out.printf("%s %s%n", p.getName(), p.getSurname())); 
    }
}