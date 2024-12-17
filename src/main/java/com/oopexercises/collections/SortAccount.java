package com.oopexercises.collections;

import java.time.LocalDate;
import java.util.*;

public class SortAccount {
    public static class Account {
        double amount;
        double interestRate;
        LocalDate duePayment;

        public Account(double amount, double interestRate, LocalDate duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public LocalDate getDuePayment() {
            return duePayment;
        }

        public void setDuePayment(LocalDate duePayment) {
            this.duePayment = duePayment;
        }
    }

    public static void sortByAmount(List<Account> accounts) {
        Collections.sort(accounts, new Comparator<Account>() {

            @Override
            public int compare(Account o1, Account o2) {
                return Double.compare(o1.amount, o2.amount);
            }
        });
    }

    public static void sortByInterestRate(List<Account> accounts) {
        Collections.sort(accounts, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return Double.compare(o1.interestRate, o2.interestRate);
            }
        });
    }

    public static void sortByDuePayment(List<Account> accounts) {
        Collections.sort(accounts, new Comparator<Account>() {

            @Override
            public int compare(Account o1, Account o2) {
                return o1.duePayment.compareTo(o2.duePayment);
            }
        });
    }
}
