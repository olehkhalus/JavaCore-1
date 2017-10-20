package com.hw.hw5.employee;

import java.util.List;
import java.util.ArrayList;

public class Employee {
    
    protected static final List<Employee> EMP_LIST = new ArrayList<>();
    protected String id;
    protected String name;

    public Employee() {
        this("UNKNOWN", "UNKNOWN");
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void addEmployee(Employee e) {
        EMP_LIST.add(e);
    }

    public static List<Employee> getEmployee() {
        return EMP_LIST;
    }

    public String toString() {
        return String.format("ID '%s', NAME '%s'", id, name);
    }
}