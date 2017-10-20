abstract class Employee{
    private String name;
    private int employeeld;
    private float averageMonthlyWage;

    protected Employee(String name, int employeeld){
        this.name = name;
        this.employeeld = employeeld;
    }

    protected void setName(String name) {
        this.name = name;
    }
    protected void setEmployeeld(int employeeld) {
        this.employeeld = employeeld;
    }
    protected void setAverageMonthlyWage(float averageMonthlyWage){
        this.averageMonthlyWage = averageMonthlyWage;
    }

    abstract void calculatePay();

    protected void describe(){
        System.out.println("Employee Id: " + this.employeeld
                + "\nEmployee name: " + this.name
                + "\nEmployee average monthly wage: " + this.averageMonthlyWage +"\n");
    }
}