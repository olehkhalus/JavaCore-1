package com.hw.hw5.person;

public abstract class Staff extends Person {
    
    protected int hours;
    protected double wage;
    protected double salary;

    public Staff() {    }

    public Staff(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public Staff(String name, int hours, double wage) {
        super(name);
        this.hours = hours;
        this.wage = wage;
    }

    public abstract double getSalary();

}