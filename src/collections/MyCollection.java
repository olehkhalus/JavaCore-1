package collections;

import java.util.List;
import java.util.ArrayList;


public class MyCollection {
    public static void main(String [] args){
        List<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("Vasya", 15));
        list.add(new Employee("Anna", 2));
        list.add(new Employee("Alina", 40));
        list.add(new Employee("Illia",5));
        list.add(new Employee("Ivan", 12));

        list.sort(new NameComparator());
        for (Employee employee : list) {
            System.out.println(employee);
        }

        System.out.println("---------------------------------------");
        System.out.println("");

        list.sort(new TabComparator());
        for (Employee employee : list) {
            System.out.println(employee);
        }

        System.out.println("---------------------------------------");
        System.out.println("");

        System.out.println(list.get(4));

    }

}
