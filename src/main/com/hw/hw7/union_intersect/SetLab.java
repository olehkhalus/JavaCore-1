package com.hw.hw7.union_intersect;

import java.util.Set;
import java.util.TreeSet;

public class SetLab {
 
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> tmp = new TreeSet<T>(set1);
        tmp.addAll(set2);
        return tmp;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> tmp = new TreeSet<T>(set1);
        tmp.retainAll(set2);
        return tmp;
    }
}