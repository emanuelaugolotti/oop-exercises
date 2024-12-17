package com.oopexercises1.collections;

import java.util.*;

public class ValuesKeys {
    public static boolean valuesKeys(Map<String, String> map) {
        Set<String> keys = map.keySet();
        Collection<String> values = map.values();
        for (String value : values) {
            if (keys.contains(value)) {
                return true;
            }
        }
        return false;
    }
}