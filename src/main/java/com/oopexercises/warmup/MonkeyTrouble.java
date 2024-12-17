package com.oopexercises.warmup;

import java.util.Scanner;

public class MonkeyTrouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is monkey a smiling? [true, false]");
        boolean aSmile = scanner.nextBoolean();
        System.out.println("Is monkey b smiling? [true, false]");
        boolean bSmile = scanner.nextBoolean();

        if (aSmile == bSmile) {
            System.out.println("Alert! We are in trouble");
        }
        else {
            System.out.println("We aren't in trouble");
        }
    }
}
