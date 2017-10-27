package com.hw.hw7.practicaltasks;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class IntegerArrayListLab {
    
    private static List<Integer> nums;

    public IntegerArrayListLab(int size, int min, int max) {
        nums = new ArrayList<Integer>();
        initialise(size, min, max);
    }

    public List<Integer> getNums() {
        return nums;
    }

    private void initialise(int size, int min, int max) {
        while (nums.size() < size) {
                nums.add(ThreadLocalRandom.current().nextInt(min, max));
        }
    }

    public List<Integer> getGreater(List<Integer> list, int greater) {
        List<Integer> res = new ArrayList<>();
        for (Integer i : list) {
            if (i > greater) {
                res.add(i);
            }
        }
        return res;
    }
    
    public List<Integer> removeGreater(List<Integer> list, int greater) {
        List<Integer> res = new ArrayList<>();
        for (Integer i : list) {
            if (i < greater) {
                res.add(i);
            }
        }
        return res;
    }

    public List<Integer> insert(List<Integer> list, int pos, int val) {
        list.set(pos, val);
        return list;
    }
    
    public void print(List<Integer> list) {
       list.forEach(System.out::println);
    }

    public List<Integer> sortElements(List<Integer> list) {
        Collections.sort(list);
        return list;
    }
}