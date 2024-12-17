package com.oopexercises.collections;

import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>(list);
        return new ArrayList<>(linkedHashSet);
    }
}
