package com.homework.lesson2;

import com.homework.lesson1.Task;

public class Main {

    public static void main(String[] args) {
        /*Add class Employee to the project..
        * Class Employee should consists of
	        three private fields: name, rate and hours;
	        static field totalHours
	        properties for access to these fields;
	        default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
	      methods:
            salary - to calculate the salary of person (rate * hours)
            toString - to output information about employee
            changeRate - to change the rate of employee
            bonuses – to calculate % from salary
            In the method main() create 3 objects of Employee type. Input information about them. */
        Employee oleg = new Employee("Oleg", 2600, 8);
        Employee vasia = new Employee("Vasia", 3600, 6);
        Employee dima = new Employee("Dima", 4600, 4);
        show(oleg.toString());
        show(vasia.toString());
        show(dima.toString());

        System.out.println(oleg.getHours() + dima.getHours() + vasia.getHours());
    }

    private static void show(String text) {
        System.out.println(text);
    }
}
