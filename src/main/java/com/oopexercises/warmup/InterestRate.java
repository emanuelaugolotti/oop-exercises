package com.oopexercises.warmup;

public class InterestRate {
    public static double calculate_new_balance (double balance) {
        double interest_rate = (balance * 5) / 100;
        return balance + interest_rate;
    }

    public static void main(String[] args) {
        double balance = 1000;

        balance = calculate_new_balance(balance);
        System.out.println("""
    The account has an initial balance of $1000 and earns 5 percent interest per year.
    After the first year the balance is:""" + " $" + balance);

        balance = calculate_new_balance(balance);
        System.out.println("After the second year the balance is: " + "$" + balance);

        balance = calculate_new_balance(balance);
        System.out.println("After the third year the balance is: " + "$" + balance);
    }
}
