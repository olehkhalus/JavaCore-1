//non fixed
public class SalariedEmployee extends Employee implements Calculate{

    private int hourlyRate;
    private int numHourWorked;
    private String socialSecurityNumber;

    public SalariedEmployee(int hourlyRate, int numHourWorked, String socialSecurityNumber, String name, int employeeId){
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.numHourWorked = numHourWorked;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setHourlyRate(int hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    public void setNumHourWorked(int numHourWorked){
        this.numHourWorked = numHourWorked;
    }
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void calculatePay(){
        super.setAverageMonthlyWage((this.hourlyRate * this.numHourWorked) - getSecuritySocialValue(this.socialSecurityNumber));
    }

    public void describe(){
        super.describe();
        System.out.println("Employee type: hourly paid worker"
                + "\nEmployee hourlyRate: " + this.hourlyRate
                + "\nEmployee numHourWorked: " + this.numHourWorked
                + "\nEmployee socialSecurityNumber: " + this.socialSecurityNumber);
    }

    private float getSecuritySocialValue(String socialSecurityNumber){
        switch(socialSecurityNumber.toUpperCase()) {
            case "111A":
                return -300f;
            case "222B":
                return -500f;
            case "333C":
                return -750.50f;
            case "444F":
                return -1300.77f;
            default:
                return -1000f;
        }
    }
}
