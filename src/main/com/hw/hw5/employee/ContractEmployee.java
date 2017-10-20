package com.hw.hw5.employee;

public class ContractEmployee extends Employee implements Payable {
    
    protected double wage;
    protected String FEIN;
    
    public ContractEmployee() {    }

    public ContractEmployee(String id, String name, double wage, String FEIN) {
        super(id, name);
        this.wage = wage;
        this.FEIN = FEIN;
    }
    
    public double getPay() {
        return wage;
    }
    
    public String toString() {
        return String.format("%s, WAGE '%.2f', FEIN '%s'", super.toString(), getPay(), FEIN);
    }
}
