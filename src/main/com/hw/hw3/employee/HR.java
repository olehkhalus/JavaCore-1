package com.hw.hw3.employee;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class HR {
    private static List<Employee> employees = new ArrayList<>();

    public static void addEmployee(Employee e) {
        employees.add(e);
    }

    public static List<Employee> getEmployees() {
        return employees;
    }

    public static List<Employee> sortBySalary() {
        Collections.sort(employees, (e1, e2) -> (int) (e1.getSalary() - e2.getSalary()));
        return employees;
    }
}