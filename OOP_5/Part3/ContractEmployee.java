import java.util.Random;

public class ContractEmployee implements Employee {
    public int monthlySalary;
    private String federalTaxIdmember=federalTaxIdmember();
    private String name;
    private int monthlyPay;

    public ContractEmployee(String name, int monthlyPay){
        this.name = name;
        this.monthlyPay=monthlyPay;
    }

    public Integer getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public void calculatePay() {
        monthlySalary=monthlyPay;
    }
    String federalTaxIdmember (){
        Random firstPart = new Random();
        StringBuilder sb = new StringBuilder();
        int a1 = firstPart.nextInt(100);
        if (a1<10)
            sb.append("0");
        sb.append(a1);
        sb.append("-");
        Random secondPart = new Random();
        int a2 = secondPart.nextInt(9999999);
        if (a2<10000000)
            sb.append("0");
        if (a2<1000000)
            sb.append("0");
        if (a2<100000)
            sb.append("0");
        if (a2<10000)
            sb.append("0");
        if (a2<1000)
            sb.append("0");
        if (a2<100)
            sb.append("0");
        if (a2<10)
            sb.append("0");
        sb.append(a2);
        return sb.toString();
    }
    public String toString(){
        return (name+" have a salary: "+monthlySalary+", ID: "+federalTaxIdmember);
    }
}
