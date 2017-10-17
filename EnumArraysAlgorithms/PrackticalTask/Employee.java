package EnumArraysAlgorithms.PrackticalTask;

/**
 * Created by golov on 17.10.2017.
 */
public class Employee {

    private String name;
    private Department departmantName;
    private double salary;

    public String getName() {
        return name;
    }

    public Department getDepartmantName() {
        return departmantName;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmantName(Department departmantName) {
        this.departmantName = departmantName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public Employee(String name, Department departmentName, double salary) {
        this.name = name;
        this.departmantName = departmantName;
        this.salary = salary;
    }

    public enum Department {
        DEPARTMENT_1, DEPARTMENT_2, DEPARTMENT_3
    }


}
