// Create a class Employee with fields name, department name, salary.
// Declare enum with department names. Create array with five objects of class Employee.
// Display all employees of a certain department (enter department name in the console);
// arrange workers by the field salary in the ascending and descending order.

package Home_Work3;

import java.util.Scanner;

class Employee {
    private String name;
    private String department;
    private Double salary;

    public enum department { DepartmentOfCommerce , DepartmentOfLabor}

    Employee() {
    }
    public Employee(String name, String department , Double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void setName(String name) {
        this.name = name;
    } String getName() {
        return name;
    }
    void setDepartment(String department) {
        this.department = department;
    } String getDepartment() {
        return department;
    }
    void setSalary(Double salary) {
        this.salary = salary;
    } Double getSalary() {
        return salary;
    }

    void output () {
        System.out.print("Worker name: "+name);
        System.out.print("  Department: "+department);
        System.out.print("  Salary: "+salary);
        System.out.println();
    }

}

public class Presentation4_Task3 {
    public static void main( String[] Args) {
        Scanner sc = new Scanner(System.in);

        //Creating array with list of workers

        Employee[] List = new Employee[5];
        List[0] = new Employee("Andriy","DepartmentOfCommerce", 3000.0);
        List[1] = new Employee("Adolf","DepartmentOfCommerce", 4000.0);
        List[2] = new Employee("Ivan","DepartmentOfLabor", 2000.0);
        List[3] = new Employee("Oleg","DepartmentOfCommerce", 2500.0);
        List[4] = new Employee("Olga","DepartmentOfLabor", 1800.0);

        // Output workers of entered department

        String EnteredDepartment = null;
        System.out.println("Enter Department");
        if (sc.hasNextLine()){
            EnteredDepartment = sc.nextLine();
        } else {
            System.out.println("Incorrect ");
        }
        for ( int i = 0 ; i < List.length ; i++){
            String Dep = List[i].getDepartment();
            if (Dep.equals(EnteredDepartment)) {
                List[i].output();
            }
        }

        System.out.println();

        //Arranging in ascending order

        Employee[] AscendingList = new Employee[5];
        AscendingList = List;
        Employee tmp = new Employee();
        for (int i = 0 ; i < List.length-1; i++ ) {
            for ( int j = i+1 ; j < List.length ; j++ ) {
                if ( List[i].getSalary() < List[j].getSalary() ) {
                    tmp =  AscendingList[i];
                    AscendingList[i] = AscendingList[j];
                    AscendingList[j] = tmp;
                }
            }
        }
        for ( int i = 0 ; i < AscendingList.length ; i++) {
            AscendingList[i].output();
        }


    }
}
