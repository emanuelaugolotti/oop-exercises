package com.oopexercises.collections;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagrams {
    public static boolean areAnagrams(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        Map<Character, Integer> hashMapFirst = CheckAnagrams.fillMap(first);
        Map<Character, Integer> hashMapSecond = CheckAnagrams.fillMap(second);
        return (hashMapFirst.equals(hashMapSecond));
    }

    private static Map<Character, Integer> fillMap(String string) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char currentChar = Character.toLowerCase(string.charAt(i));
            if (hashMap.containsKey(currentChar)) {
                Integer value = hashMap.get(currentChar);
                hashMap.replace(currentChar, value + 1);
            } else {
                hashMap.put(currentChar, 1);
            }
        }
        return hashMap;
    }
}
