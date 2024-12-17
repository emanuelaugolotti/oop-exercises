package com.oopexercises1.warmup;

import java.util.Random;
import java.util.Scanner;

public class TheRightPrice {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();
        int price = generator.nextInt(101);

        System.out.println("I'm selecting a price between 0 and 100");
        System.out.print("User (1) let's guess the price: ");
        int input1 = scanner.nextInt();

        System.out.print("User (2) let's guess the price: ");
        int input2 = scanner.nextInt();

        if (Math.abs(price - input1) < Math.abs(price - input2)) {
            System.out.println("The win is user (1)! The price is " + price);
        }
        else {
            System.out.println("The win is user (2)! The price is " + price);
        }
    }
}
