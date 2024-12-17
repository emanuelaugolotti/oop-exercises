package com.oopexercises.collections;

import java.util.*;

public class Intersection {
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>();

        for (Integer next : first) {
            if (second.contains(next)) {
                intersection.add(next);
            }
        }

        // Versione alternativa
//        Iterator<Integer> i = first.iterator();
//        while (i.hasNext()) {
//            Integer next = i.next();
//            if (second.contains(next)) {
//                intersection.add(next);
//            }
//        }

        return intersection;
    }

    public static Set<Integer> intersectionRetainAll(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }
}
