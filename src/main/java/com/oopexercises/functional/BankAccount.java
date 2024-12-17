package com.oopexercises.functional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class BankAccount {
    public static class Account {
        double amount;
        double interestRate;
        LocalDateTime duePayment;

        public Account(double amount, double interestRate, LocalDateTime duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }

        public double getAmount() {
            return amount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public LocalDateTime getDuePayment() {
            return duePayment;
        }

        public void applyInterest() {
            amount += amount * interestRate;
        }
    }

    public static List<Account> applyInterest(List<Account> accounts) {
        return accounts.stream()
                .filter(account -> account.getDuePayment().isBefore(LocalDateTime.now()))
//                .map(account -> {
//                    double amountNew = account.getAmount() + account.getInterestRate() * account.getAmount();
//                    return new Account(amountNew, account.getInterestRate(), account.getDuePayment());
//                })
                .peek(Account::applyInterest)
                .sorted((o1, o2) -> (int) (o2.getAmount() - o1.getAmount()))
                .collect(Collectors.toList());
    }
}
