import java.util.Random;

/*Create an interface to the method calculatePay(), the base class Employee with a string variable employeeld.
Create two classes SalariedEmployee and ContractEmployee,
which implement interface and are inherited from the base class.

 */
public class Main {
    public static void main(String...args) throws NullPointerException{
        Employee[] workers = new Employee[5];
        SalariedEmployee employee  = new SalariedEmployee("Mikle", 150,30);
        employee.calculatePay();
        SalariedEmployee employee1 = new SalariedEmployee("Sasha", 170, 35);
        employee1.calculatePay();
        ContractEmployee employee2 = new ContractEmployee("Lyna", 3800);
        employee2.calculatePay();
        ContractEmployee employee3 = new ContractEmployee("Edward", 5000);
        employee3.calculatePay();
        workers[0]=employee;
        workers[1]=employee1;
        workers[2]=employee2;
        workers[3]=employee3;
        workers[4]=employee;
        try {
            for (int i = 0; i < workers.length - 1; i++) {
                for (int j = i + 1; j < workers.length - 1; j++) {
                    if (workers[i].getMonthlySalary() < workers[j].getMonthlySalary()) {
                        workers[4] = workers[j];
                        workers[j] = workers[i];
                        workers[i] = workers[4];
                    }
                }
            }
            for (int y = 0; y < workers.length - 1; y++) {
                System.out.println(workers[y]);
            }
        }catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
