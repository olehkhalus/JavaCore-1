package com.hw.hw5.employee;

public class SalariedEmployee extends Employee implements Payable {
    
    protected double salary;
    protected int hours;
    protected String SNN;
    
    public SalariedEmployee() {    }

    public SalariedEmployee(String id, String name, double salary, int hours, String SNN) {
        super(id, name);
        this.salary = salary;
        this.hours = hours;
        this.SNN = SNN;
    }

    public double getPay() {
        return salary * hours;
    }

    public String toString() {
        return String.format("%s, SALARY '%.2f', HOURS '%d', SNN '%s'", super.toString(), getPay(), hours, SNN);
    }
}