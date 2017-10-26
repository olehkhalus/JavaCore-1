package homework3;

public class Employee implements Comparable {
    private String name;
    private double salary;
    private department departName;

    enum department {
        DEPART1, DEPART2, DEPART3, DEPART4, DEPART5
    }
    public Employee(){

    }
    public Employee(String name, department departName, double salary){
        this.name = name;
        this.salary = salary;
        this.departName = departName;
    }

    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public department getDepartName(){
        return  departName;
    }
    public  department setDepartName (department departName){
        this.departName = departName;
        return departName;
    }
    public double getSalary(){
        return  salary;
    }
    public void setSalary (double salary){
        this.salary = salary;
    }
    public int compareTo(Object obj)
    {
        Employee tmp = (Employee) obj;
        if(this.salary < tmp.salary)
        {
            return -1;
        }
        else if(this.salary > tmp.salary)
        {
            return 1;
        }
        return 0;
    }
}
