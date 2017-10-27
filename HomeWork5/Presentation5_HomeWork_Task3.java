package HomeWork5;

//Create an interface to the method calculatePay(), the base class Employee with a string variable employeeld.
//Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child).
//Describe the string variable socialSecurityNumber in the class SalariedEmployee .
//Include a description of federalTaxIdmember in the class of contractEmployee .
//The calculation formula for the "time-worker“ is: "the average monthly salary = hourly rate * number of hours worked"
//For employees with a fixed payment the formula is: "the average monthly salary = fixed monthly payment“
//Create an array of employees and add the employees with different form of payment.
//Arrange the entire sequence of workers descending the average monthly wage.
// Output the employee ID, name, and the average monthly wage for all elements of the list.

interface payment {
    double getPay();
}

class Employee {
    String employeeld;
    String name;
    String id;

    Employee(){}
    Employee( String name , String id) {
        this.name = name;
        this.id = id;
    }

    String outPut() {
        return ( "id: "+id + " name: " + name);
    }

}

class HourlyPaid extends Employee implements payment {
    int hours;
    double salary;

    HourlyPaid(){}
    HourlyPaid(String id , String name , int hours , double salary){
        super ( id , name );
        this.hours = hours;
        this.salary = salary;
    }


    public double getPay() {
        return salary*hours;
    }

    String outPut(){
        return ( super.outPut()+" payment :"+getPay());
    }

}

class ContractWorker extends Employee implements payment {
    double wage;

    ContractWorker(){}
    ContractWorker(String id , String name , double wage){
        super ( id , name );
        this.wage = wage;
    }


    public double getPay() {
        return wage;
    }

    String outPut(){
        return ( super.outPut()+" payment :"+getPay());
    }

}


public class Presentation5_HomeWork_Task3 {
    public static void main (String[] Args) {

        Employee[] List = new Employee[2];
        List[0] = new HourlyPaid( "id1" , "oleg" , 12 , 25);
        List[1] = new ContractWorker ("id2" , "Adolf" , 1500);

        for ( int i = 0 ; i <2 ; i++) {
            System.out.println(List[i].outPut());
        }
    }
}
