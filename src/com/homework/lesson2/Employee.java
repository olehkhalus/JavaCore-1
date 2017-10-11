package com.homework.lesson2;

public class Employee {
    private String name = null;
    private int rate = 0;
    private int hours = 0;
    private static int totalHours = 0;

    public Employee(String name, int rate) {
        setName(name);
        setRate(rate);
    }

    public Employee(String name, int rate, int hours) {
        setName(name);
        setRate(rate);
        setHours(hours);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static int getTotalHours() {
        return totalHours;
    }

    public static void setTotalHours(int totalHours) {
        Employee.totalHours = totalHours;
    }

    public int salary(int rate, int hours) {
        return rate * hours;
    }

    public String toString() {
        return "[Name = " + name + ", rate = " + rate + ", hours = " + hours + " ]";
    }

    public void bonuses(int bonus) {
        rate = (getRate() * 100) / bonus;
    }
}
