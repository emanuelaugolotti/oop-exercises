package com.oopexercises.functional;

import java.util.Map;

public class PayMore {
    public static void payMore(Map<String, Double> fees, String numberFamily, double costDelta) {
        fees.replaceAll((key, value) -> key.startsWith(numberFamily) ? value + costDelta : value);
    }
}
