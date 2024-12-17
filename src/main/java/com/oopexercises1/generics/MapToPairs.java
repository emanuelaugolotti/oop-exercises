package com.oopexercises1.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapToPairs {
    public static <K, V> List<Pair<K, V>> mapToPairs(Map<K, V> src) {
        List<Pair<K, V>> out = new ArrayList<>();
        for (Map.Entry<K, V> entry : src.entrySet()) {
            Pair<K, V> pair = new Pair<>(entry.getKey(), entry.getValue());
            out.add(pair);
        }
        return out;
    }
}
