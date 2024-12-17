package com.oopexercises.strings;

import java.util.StringTokenizer;

public class CountYZ {
    public static int countYZ(String string) {
        StringTokenizer st = new StringTokenizer(string);
        int countYZ = 0;
        while (st.hasMoreTokens()) {
            String token = st.nextToken().toLowerCase();
            if (token.endsWith("y") || token.endsWith("z")) {
                countYZ++;
            }
        }
        return countYZ;
    }
}
