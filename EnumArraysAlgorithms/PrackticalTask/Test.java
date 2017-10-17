package EnumArraysAlgorithms.PrackticalTask;

import java.util.Scanner;

/**
 * Created by golov on 17.10.2017.
 */
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

        int workerCount  = 0;
        while (workerCount < employees.length) {
            if (worker.equals(employees[workerCount].getDepartmantName().name())) {
                System.out.println(employees[workerCount].getName());
            }
            workerCount++;
        }
    }
}