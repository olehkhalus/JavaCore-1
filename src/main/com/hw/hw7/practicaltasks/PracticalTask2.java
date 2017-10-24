package com.hw.hw7.practicaltasks;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class PracticalTask2 {
    private static final Scanner STDIN = new Scanner(System.in);
    
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Homer");
        employeeMap.put(2, "Marge");
        employeeMap.put(3, "Lenny");
        employeeMap.put(4, "Carl");
        employeeMap.put(5, "Bart");
        employeeMap.put(6, "Lisa");
        employeeMap.put(7, "Maggie");
        
        System.out.println("Enter employee's ID");
        Integer id = STDIN.nextInt();
        
        if (employeeMap.containsKey(id)) {
            System.out.println(employeeMap.get(id));
        } else {
            System.out.println("No such employee");
        }
        STDIN.nextLine();
        
        System.out.println("Enter employee's name");
        Integer key = null;
        String name = STDIN.nextLine();
        for (Map.Entry entry : employeeMap.entrySet()) {
            if (name.equals(entry.getValue())) {
                System.out.println((Integer) entry.getKey());
                break; 
            }
        }
    }
}