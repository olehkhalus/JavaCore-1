public class Main {

    private static int _id = 0;

    public static void main(String[] args) {

        Employee name1 = new ContractEmployee(5500, 2, "Sasha", ++_id);
        Employee name2 = new SalariedEmployee(150, 80, "111A", "Lida", ++_id);
        Employee name3 = new ContractEmployee(6000, 1, "Igor", ++_id);
        Employee name4 = new SalariedEmployee(200,86,"222B","Inga", ++_id);
        Employee name5 = new ContractEmployee(3000, 3,"Oleg", ++_id);
        Employee name6 = new SalariedEmployee(100,90,"444F","Lisa", ++_id);
        Employee nameArray[] = {name1, name2, name3, name4, name5, name6};
        for (int x = 0 ; x < nameArray.length; x++) {
            nameArray[x].calculatePay();
            nameArray[x].describe();
        }
    }
}