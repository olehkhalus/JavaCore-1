package com.veboro;

import java.util.Scanner;

/**
 * Created by golov on 12.10.2017.
 */
public class HomeWorkEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);
        Employee employee1 = new Employee("Anrew",2500);
        employee1.setHours(25);
        System.out.println(employee1);
        Employee employee3 = new Employee("Andrew",2500, 30);
        System.out.println(employee3);
        System.out.println("Total hours of all workers " + Employee.totalHours);

    }
}

class Employee {
    private String name;
    private int rate;
    private int hours;
    static int totalHours;

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
        totalHours += hours;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    //Default constructor
    public Employee(){

    }

    //Constructor whit 2 parameters
    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    //Constructor whit 3 parameters
    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalHours +=hours;
    }

    //calculate the salary of person
    int salary(){
        int salary = this.getRate()+this.getHours();
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[Name = "+getName()+", rate = "+getRate()+", hours= "+getHours()+"]";
    }

    //change the rate of employee
    void changeRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new rate: ");
        try {
            setRate(scanner.nextInt());
        } catch (Exception e){
            System.err.println("Int only");
        }

    }

    //calculate % from salary
    void bonuses (){
        System.out.println("Your bonus " +salary()*2/100+" dollars");
    }
}
