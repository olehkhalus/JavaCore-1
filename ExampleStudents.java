package com.veboro;

import java.util.Scanner;

public class ExampleStudents {
    public static void main(String[] args) {

        //Using the constructor
        Student student = new Student("Andrew",4.8);
        Student student2 = new Student("Andrew",4.7);
        Student student3 = new Student();
        student3.setRating(5.0);
        System.out.println(Student.betterStudent(student,student2));
        System.out.println("Average rating is "+Student.avgRating);
        System.out.println("Total rating is "+Student.total);

        //Using the array
     Student [] std = new Student[2];
        std[0] = new Student("Andrew",4.3);
        std[1] = new Student("Andrew2", 4.7);
        std[1] = new Student("Andrew2", 4.7);

        for (int i = 0; i <std.length; i++){
            Student.avgRating += std[i].getRating();
        }
        //Running strange:)
        System.out.println("Average rating is "+Student.avgRating/std.length);

    }

}

class Student {
    private String name;
    private double rating;
    static double avgRating;
    static int cout;
    static double total;

    //Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    //Constructors
    public Student(){
        cout++;
        total = total+rating;
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        cout++;
        avgRating = (avgRating+rating)/cout;
        total = total+rating;
    }

    //definite the better student (between two, return true or false)
    static boolean betterStudent (Student student1, Student student2){
        if (student1.getRating()>student2.getRating()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "com.veboro.Student [Name = "+getName()+", rating "+getRating()+"]";
    }

    //change the rating of student
    void changeRating(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rating of the student: ");
        setRating(scanner.nextDouble());
    }
}
