package homework3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main (String[]Args){
        System.out.println("Enter Department: ");
        Employee [] employees = new Employee[5];
        employees[0] = new Employee("Ivan",Employee.department.DEPART1,2500);
        employees[1] = new Employee("Petya",Employee.department.DEPART2,1500);
        employees[2] = new Employee("Vasya",Employee.department.DEPART3,12000);
        employees[3] = new Employee("Illia",Employee.department.DEPART4,15500);
        employees[4] = new Employee("Kris",Employee.department.DEPART1,22500);

        Scanner sc = new Scanner(System.in);
        String depart = sc.nextLine();

        for (Employee employee : employees) {
            if (depart.equals(employee.getDepartName().name())){
                System.out.println("\n Employees from this department are: " + employee.getName());
            }
        }

        System.out.println("Ascending sorting");
        Arrays.sort(employees);
        for(int i=0; i<employees.length; i++ ){
            System.out.println(employees[i].getName()+" has salary "+employees[i].getSalary());
        }
        System.out.println("descending ordering");
        Arrays.sort(employees, Collections.reverseOrder());
        for(int i = 0; i < employees.length; i++){
            System.out.println(employees[i].getName()+" has salary "+employees[i].getSalary());
        }




    }
}
