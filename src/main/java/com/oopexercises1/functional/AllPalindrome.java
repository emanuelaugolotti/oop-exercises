package com.oopexercises1.functional;

import java.util.List;

public class AllPalindrome {

    static boolean isPalindrome (String string) {
        StringBuilder sbReverse = new StringBuilder(string).reverse();
        return string.contentEquals(sbReverse);
    }

    public static boolean allPalindrome(List<String> strings) {
        return strings.stream().allMatch(AllPalindrome::isPalindrome);
    }
}
