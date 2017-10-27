package com.hw.hw7.student;

import java.util.List;
import java.util.Iterator;


public class Student {
    
    private String name;
    private Integer course;

    public Student() {
        this("UNKNOWN", 0);
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Integer getCourse() {
        return course;
    }
}