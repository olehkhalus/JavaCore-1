package com.hw.hw2.student;

public class Student {
    public static final String DEFAULT_NAME = "UNKNOWN";
    public static final double DEFAULT_RATING = 0.0;
    public static double avgRating;
    public static double tmpRating;
    private static int tmpCount;

    private String name;
    private double rating;
    
    public Student() {
        this(DEFAULT_NAME, DEFAULT_RATING);
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        tmpCount++;
        tmpRating += rating;
        avgRating = tmpRating / tmpCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public static String getHigherScore(Student s1, Student s2) {
        String result = "";
        if (s1.rating == s2.rating) {
            result = String.format("Both, %s w/ %s) have equal score", s1.name, s2.name);
        } else {
            result = s1.rating > s2.rating ? String.format("Student '%s' has higher score than '%s'", s1.name, s2.name) : String.format("Student '%s' has higher score than '%s'", s2.name, s1.name);
        }
        return result;
    }
}