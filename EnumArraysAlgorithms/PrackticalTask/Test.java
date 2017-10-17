package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("Enter a department name: ");

        Employee [] employees = new Employee[5];
        employees[0] = new Employee("Worker1", Employee.Department.DEPARTMENT_1,1500);
        employees[1] = new Employee("Worker2",Employee.Department.DEPARTMENT_2,1700);
        employees[2] = new Employee("Worker3",Employee.Department.DEPARTMENT_3,2000);
        employees[3] = new Employee("Worker4",Employee.Department.DEPARTMENT_1,3000);
        employees[4] = new Employee("Worker5",Employee.Department.DEPARTMENT_3,1100);

        Scanner scn = new Scanner(System.in);
        String worker = scn.nextLine();

        for (Employee employee : employees) {
            if (worker.equals(employee.getDepartmantName().name())) {
                System.out.println(employee.getName());
            }
        }
        System.out.println("ascending ordering");
        Arrays.sort(employees);
        for(int i = 0; i < employees.length; i++)
        {
            System.out.println(employees[i].getName()+" has salary "+employees[i].getSalary());
        }
        System.out.println("descending ordering");
        Arrays.sort(employees, Collections.reverseOrder());
        for(int i = 0; i < employees.length; i++)
        {
            System.out.println(employees[i].getName()+" has salary "+employees[i].getSalary());
        }
    }
}
