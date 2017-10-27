package com.hw.hw7.practicaltasks;

import java.util.Map;
import java.util.HashMap;

public class EmployeeHashMapLab {
    
    private final Map<Integer, String> employee = new HashMap<>();
    
    public void add(Integer key, String val) {
        employee.put(key, val);
    }    

    public String getVal(Integer key) {
        if (employee.containsKey(key)) {
            return employee.get(key);
        } else {
            throw new IllegalArgumentException("There is no such employee");
        }
    }

    public Integer getKey(String name) throws IllegalArgumentException {        
        Integer key = Integer.MIN_VALUE;
        for (Map.Entry e : employee.entrySet()) {
            if (name.equals(e.getValue())) {
                key = (Integer) e.getKey();
            }
        }
        return key;
    }
}