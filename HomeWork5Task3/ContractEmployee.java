//fixed
public class ContractEmployee extends Employee implements Calculate{

    private int fixedMonthlyPayment;
    private int federalTaxMemberId;

    public ContractEmployee(int fixedMonthlyPayment, int federalTaxMemberId, String name, int employeeId){
        super(name, employeeId);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.federalTaxMemberId = federalTaxMemberId;
    }
    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }
    public void setFederalTaxMemberId(int federalTaxMemberId){
        this.federalTaxMemberId = federalTaxMemberId;
    }

    public void calculatePay(){
        super.setAverageMonthlyWage(this.fixedMonthlyPayment * getFederalTax() * 100);
    }

    public void describe(){
        super.describe();
        System.out.println("Employee type: fixed paid worker"
                + "Employee federal tax: " + this.getFederalTax());
    }

    private float getFederalTax(){
        int fax = this.federalTaxMemberId;
        switch(fax) {
            case 1:
                return 0.01f;
            case 2:
                return 0.02f;
            case 3:
                return 0.03f;
            case 4:
                return 0.04f;
            default:
                return 0.05f;
        }
    }

}
