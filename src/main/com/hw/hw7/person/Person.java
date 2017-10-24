package com.hw.hw7.person;

import java.util.Map;
import java.util.HashMap;

public class Person {
    protected static final Map<String, String> personMap = new HashMap<>();

    protected static void initialize(String firstName, String lastName) {
        personMap.put(firstName, lastName);
    }

    protected static void remove(String name) {
        personMap.remove(name);
    }
}