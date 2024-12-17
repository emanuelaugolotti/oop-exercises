package com.oopexercises.strings;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder temp = new StringBuilder(s);
        temp.reverse();
        //return s.contentEquals(temp); // case-sensitive
        return s.equalsIgnoreCase(temp.toString()); // not case-sensitive
    }
}

//public class Palindrome {
//    public static boolean isPalindrome(String s) {
//        String reversedString = new StringBuilder(s).reverse().toString();
//        return reversedString.equalsIgnoreCase(s);
//    }
//}
