package com.oopexercises1.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InvertMap {
    public static Map<String, Integer> invertMap(Map<Integer, String> src) {
        Map<String, Integer> out = new HashMap<>();
        Set<Map.Entry<Integer, String>> set = src.entrySet();
        for (Map.Entry<Integer, String> element : set) {
            if (!out.containsKey(element.getValue())) {
                out.put(element.getValue(), element.getKey());
            }
        }
        return out;
    }
}
