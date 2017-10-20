interface Calc{
    double calculatePay();
        }
abstract public class Employee {
String name;
double salary;

    public Employee(String name) {
        this.name=name;
    }
}
class SalariedEmployee extends Employee implements Calc{
    private String SSN;
    private int workHours;
    private int rate;

    public SalariedEmployee(String name,String SSN, int workHours, int rate) {
        super(name);
        this.SSN = SSN;
        this.workHours=workHours;
        this.rate=rate;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public double calculatePay() {
        return workHours*rate;
    }
}
class ContractEmployee extends Employee implements Calc{
    private String federealTaxID;
    double fixedSalary;

    public ContractEmployee(String name, String federealTaxID,double fixedSalary) {
        super(name);
        this.federealTaxID = federealTaxID;
        this.fixedSalary=fixedSalary;
    }

    public String getFederealTaxID() {
        return federealTaxID;
    }

    public void setFederealTaxID(String federealTaxID) {
        this.federealTaxID = federealTaxID;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculatePay() {
        return this.fixedSalary;
    }
}