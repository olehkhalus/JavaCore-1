//Create Console Application project in Java.
//Add class Student to the project.
//Class Student should consists of
//two private fields: name and rating;
//properties for access to these fields
//static field avgRating – average rating of all students
//default constructor and constructor with parameters
//methods:
//betterStudent - to definite the better student (between two, return true or false)
//      toString - to output information about student
//      changeRating - to change the rating of student
//In the method main() create 3 objects of Student type and input information about them.
//Display the average and total rating of all student.

package Home_Work2;

import java.util.Scanner;

class Student {
    private String name;
    private double rating;
    static double avgRating;
    static int number_of_students =0;
    static double sum_of_marks =0;

    // constructors

    Student () {
        number_of_students++;
        sum_of_marks = sum_of_marks+rating;
    }
    public Student(String name , double rating) {
        number_of_students++;
        this.name = name;
        this.rating = rating;
        sum_of_marks = sum_of_marks+rating;
    }

    // getters and setters

    public void setName(String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }


    public void setRating( double rating) {
        this.rating = rating;
        sum_of_marks = sum_of_marks+rating;
    }
    public double getRating () {
        return rating;
    }

    // methods

        // compare students
    static boolean studentCompare ( Student student1 , Student student2) {
        if ( student1.getRating() > student2.getRating()) {
            return true;
        } else {
            return false;
        }
    }

    void input () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student name:");
        setName(scanner.nextLine());
        System.out.println("Enter Student rating:");
        setRating(scanner.nextDouble());
    }

    void output() {
        System.out.println("Student name: "+name);
        System.out.println("Student rating: "+rating);
    }

    void changeRating() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new rating of student: ");
        setRating(scanner.nextDouble());
    }

    double avgRating () {
        return sum_of_marks/number_of_students;
    }


}

public class Student_Rating {
    public static void main( String Args[]) {
        Student student1 = new Student("Ilia",5.3);
        Student student2 = new Student("Luka", 4.2);
        Student student3 = new Student();

        student1.input();
        student1.output();
        student2.input();
        student2.output();
        student3.input();
        student3.output();

        System.out.println("Average rating is "+Student.avgRating);
        System.out.println("Total rating is "+Student.sum_of_marks);

        System.out.println(Student.studentCompare(student1,student2));


    }
}
