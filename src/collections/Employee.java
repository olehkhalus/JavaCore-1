package collections;

public class Employee {
    private int tabNumber;
    public String name;

    public Employee(){

    }

    public Employee(String name, int tabNumber) {
        this.name = name;
        this.tabNumber = tabNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTabNumber() {

        return tabNumber;
    }

    public void setTabNumber(int tabNumber) {
        this.tabNumber = tabNumber;
    }

    @Override
    public String toString() {
        return "Employee [tabNumber=" + tabNumber + ", name=" + name + "]";
    }
}
