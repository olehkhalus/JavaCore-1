package com.hw.hw2.employee;

public class Employee {
    public static final String DEFAULT_NAME = "UNKNOWN";
    public static final double DEFAULT_RATE = 0.0;
    public static final int DEFAULT_HOURS = 0;
    public static int totalHours;

    private String name;
    private double rate;
    private int hours;

    public Employee() {
        this(DEFAULT_NAME, DEFAULT_RATE);
    }

    public Employee(String name, double rate) {
        this(name, rate, DEFAULT_HOURS);
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalHours += hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;        
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getPay() {
        return rate * hours;
    }

    public double getPayWBonus(double bonus) {
        return getPay() + getPay() * bonus / 100;
    }

    @Override
    public String toString() {
        return String.format("Employee [name='%s', rate=%.4f, hours=%d]", name, rate, hours);
    }
}