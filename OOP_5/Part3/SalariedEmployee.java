import java.util.Random;
public class SalariedEmployee implements Employee {
    public int monthlySalary;
    private int hour;
    private int payForHour;
    private String socialSecurityNumber =socSecNum();
    private String name;

    public Integer getMonthlySalary() {
        return monthlySalary;
    }

    public SalariedEmployee (String name, int hour, int payForHour){
        this.name = name;
        this.hour = hour;
        this.payForHour = payForHour;
    }


    @Override
    public void calculatePay() {
        monthlySalary= hour*payForHour;
    }
    String socSecNum (){
        Random firstPart = new Random();
        StringBuilder sb = new StringBuilder();
        int a1 = firstPart.nextInt(1000);
        if (a1<100)
            sb.append("0");
        if (a1<10)
            sb.append("0");
        sb.append(a1);
        sb.append("-");
        Random secondPart = new Random();
        int a2 = secondPart.nextInt(99);
        if (a2<10)
            sb.append("0");
        sb.append(a2);
        sb.append("-");
        Random lastPart = new Random();
        int a3 = lastPart.nextInt(1000);
        if (a3<1000)
            sb.append("0");
        if (a3<100)
            sb.append("0");
        if (a1<10)
            sb.append("0");
            sb.append(a3);
        return sb.toString();
    }
    public String toString(){
        return (name+" have a salary: "+monthlySalary+", ID: "+socialSecurityNumber);
    }
}
