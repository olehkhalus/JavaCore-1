package com.hw.hw7.practicaltasks;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PracticalTask1 {
    private static final List<Integer> MY_COL = new ArrayList<>();

    public static void initializeRandom(List<Integer> list, int size, int min, int max) {
        if (list.isEmpty()) {
            while (list.size() < size) {
                list.add(ThreadLocalRandom.current().nextInt(min, max));
            }
        }
    }

    public static List<Integer> getGreaterThanList(List<Integer> list, int greater) {
        List<Integer> res = new ArrayList<>();
        for (Integer i : list) {
            if (i > greater) {
                res.add(i);
            }
        }
        return res;
    }
    
    public static List<Integer> removeGreaterThan(List<Integer> list, int greater) {
        List<Integer> res = new ArrayList<>();
        for (Integer i : list) {
            if (i < greater) {
                res.add(i);
            }
        }
        return res;
    }

    public static void insertAndPrintElements(List<Integer> list, int pos, int val) {
        list.set(pos, val);
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("POSITION %d VALUE %d %n", i, list.get(i));
        }
    }   
    public static List<Integer> insertAndPrintElements(List<Integer> list) {
        Collections.sort(list);
        return list;
    }
}