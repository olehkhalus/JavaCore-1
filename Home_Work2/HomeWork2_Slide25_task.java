//Create Console Application project in Java.
//Add class Person to the project.
//        Class Person should consists of
//        two private fields: name and birthYear (the birthday year)
//        properties for access to these fields
//default constructor and constructor with 2 parameters
//        methods:
//        age - to calculate the age of person
//        input - to input information about person
//        output - to output information about person
//        changeName - to change the name of person
//        In the method main() create 5 objects of Person type and input information about them.

package Home_Work2;

import java.util.Scanner;

class Employee {
    private String name;
    private Double rate;
    private int hours;
    static int totalHours;

    // constructors

    Employee() {
        totalHours = totalHours + hours;
    }

    public Employee(String name, Double rate , int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalHours = totalHours + hours;
    }

    // getersand seters

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }

    void setRate(Double rate) {
        this.rate = rate;
    }
    Double getRate() {
        return rate;
    }

    void setHours(int hours) {
        this.rate = rate;
    }
    int getHours() {
        return hours;
    }

    //Methods

    void input () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter worker name:");
        setName(scanner.nextLine());
        System.out.println("Enter worker rate:");
        setRate(scanner.nextDouble());
        System.out.println("Enter worker hours:");
        setHours(scanner.nextInt());
    }

    void changeRait() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter worker rate:");
        setRate(scanner.nextDouble());
    }

    double Salary () {
        return rate*hours;
    }

    void output () {
        System.out.println("Worker name: "+name);
        System.out.println("Worker rate: "+rate);
        System.out.println("Worker hours: "+hours);
        System.out.println("Worker salary: "+Salary());
    }

}

public class HomeWork2_Slide25_task {
    public static void main(String Args[]) {

        Employee Employee1 = new Employee("Stas",50.0,10);
        Employee Employee2 = new Employee("Oleg",75.0,12);
        Employee Employee3 = new Employee("Anna",50.0,8);

        Employee2.changeRait();

        Employee1.output();
        Employee2.output();
        Employee3.output();


        System.out.println("Total hours: "+Employee.totalHours);

    }

}
