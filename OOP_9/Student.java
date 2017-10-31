import java.awt.*;
import java.awt.List;
import java.util.*;

/*Write class Student that provides information about the name of the student and his course.
Class Student should consists of
properties for access to these fields
constructor with parameters
method printStudents (List students, Integer course),
 which receives a list of students and the course number and prints to the console the names of the students from the list,
 which are taught in this course (use an iterator)
methods to compare students by name and by course
In the main() method
declare List students and add to the list five different students
display the list of students ordered by name
display the list of students ordered by cours
 */
public class Student extends List {
    private String name;
    private Integer course;

    protected Student(){}

    public Integer getCourse() {
        return course;
    }

    @Override

    public String getName() {
        return name;
    }

    protected Student (String name, Integer course){
        this.name = name;
        this.course = course;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public void printStudents (ArrayList <Student> students){
       Student tmp = new Student();
        Iterator iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public void compareStudentsByName (ArrayList<Student>students){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
    public void compareStudentsByCurse(ArrayList<Student>students){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getCourse().compareTo(o2.getCourse());
            }
        });
    }
}

