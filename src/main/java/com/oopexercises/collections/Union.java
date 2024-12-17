package com.oopexercises.collections;

import java.util.HashSet;
import java.util.Set;

public class Union {
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>(first);
        for (Integer element : second) {
            union.add(element);
        }
        return union;
    }

    public static Set<Integer> unionAddAll(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        return union;
    }
}
