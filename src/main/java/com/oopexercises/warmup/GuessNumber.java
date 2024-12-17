package com.oopexercises.warmup;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random generator = new Random();

        while (true) {
            int casual_number = generator.nextInt(0,4);
            System.out.print("I have generated a casual number between 0 and 3. Let's guess the number: ");
            int input = reader.nextInt();

            if (casual_number == input) {
                System.out.println("Correct!");
                if (casual_number == 0) {
                    break;
                }
            }
            else
            {
                System.out.println("Wrong! The casual number generated is " + casual_number);
            }
        }
    }
}