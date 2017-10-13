public class Employee {
    private String name;
    private int rate;
    private int hour;
    private static int totalHours;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getRate(){
        return rate;
    }
    public void setRate(int rate){
        this.rate=rate;
    }
    public int getHour(){
        return hour;
    }
    public void setHour(int hour) {
        totalHours-=hour;
        this.hour = hour;
        totalHours+=hour;
    }
    public Employee(){}
    public Employee(String name, int rate, int hour){
        this.name=name;
        this.rate=rate;
        this.hour=hour;
        totalHours+=hour;
    }
    public int salary(){
        return this.rate*this.hour;
    }
    @Override
    public String toString(){
        return "Employee [name ="+this.name+", rate ="+this.rate+", hours ="+this.hour+", salary = "+salary()+"]";
    }

    public static void main(String... args){
        Employee employee1=new Employee("Vitalik", 15, 8);
        Employee employee2=new Employee("Victor", 19, 10);
        Employee employee3=new Employee("Pasha", 30, 7);
        System.out.println(employee1);
        System.out.println(totalHours);
    }
}
