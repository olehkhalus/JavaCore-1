package com.hw.hw3.employee;

public class Employee {
    public static final String DEFAULT_NAME = "UNKNOWN";
    public static final Department DEFAULT_DEPARTMENT = Department.UNKNOWN;
    private static final double DEFAULT_SALARY = 0.0;
    
    private String name;
    private Department dept;
    private double salary;

    public Employee() {
        this(DEFAULT_NAME, DEFAULT_DEPARTMENT);
    }

    public Employee(String name, Department dept) {
        this(name, dept, DEFAULT_SALARY);
    }

    public Employee(String name, Department dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;        
    }

    public Department getDepartment() {
        return dept;
    }

    public void setDepartment(Department dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee [name='%s', department=%s, salary=%.2f]%n", name, dept.getDescription(), salary);
    }
}