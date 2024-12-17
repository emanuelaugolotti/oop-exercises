package com.oopexercises.oop.reverse;

//public class ReverserSlow implements Reverser {
//    @Override
//    public String reverse(String string) {
//        char[] out = new char[string.length()];
//        int j = string.length() - 1;
//        for (int i = 0; i < string.length(); i++) {
//            out[i] = string.charAt(j);
//            j--;
//        }
//        return String.valueOf(out);
//    }
//}

public class ReverserSlow implements Reverser {
    @Override
    public String reverse(String string) {
        String out = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            out += string.charAt(i);
        }
        return out;
    }
}