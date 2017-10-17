package main.java;

public class Employee {

    private String name;
    private int rate;
    private int hours;

    static int totalHours;
    static int percentBonus = 20;
    static int Min = 60;


    public void setName(String name) {
        this.name = name;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public static void setTotalHours(int totalHours) {
        Employee.totalHours = totalHours;
    }
    public static void setPercentBonus(int percentBonus) {
        Employee.percentBonus = percentBonus;
    }
    public String getName() {
        return name;
    }
    public int getRate() {
        return rate;
    }
    public int getHours() {
        return hours;
    }
    public int getMin() {
        return Min;
    }
    public static int getTotalHours() {
        return totalHours;
    }
    public static int getPercentBonus() {
        return percentBonus;
    }

    private Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    private Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public int salary() {
        return this.rate * this.hours;
    }
    public String toString() {
        return ("Name: " +name+", rate: "+rate+", hours: "+ hours );
    }
    public void changeRate(int rate){
        this.rate = rate;
    }
    public int bonuses() {
        return this.percentBonus * this.rate * this.hours / this.Min;
    }

    public static void main (String...args){
        Employee employeeDima = new Employee("Dima", 90, 6);
        Employee employeeDasha = new Employee("Dasha", 100, 7);
        Employee employeeVova = new Employee("Vova", 70, 10);
        totalHours = employeeDima.hours + employeeDasha.hours + employeeVova.hours;
        System.out.println(totalHours);
    }
}
