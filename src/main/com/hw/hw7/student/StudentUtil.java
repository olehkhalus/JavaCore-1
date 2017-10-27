package com.hw.hw7.student;

import java.util.Map;
import java.util.HashMap;


public class StudentUtil {

    private final Map<Integer, String> student = new HashMap<>();

    public void add(Student s) {
        student.put(s.getCourse(), s.getName());
    }

    public void add(Integer course, String name) {
        student.put(course, name);
    }

    public void print() {
        student.forEach((key, value) -> System.out.printf("%d '%s'%n", key, value));
    }

}