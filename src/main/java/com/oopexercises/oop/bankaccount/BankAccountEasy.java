package com.oopexercises.oop.bankaccount;

public class BankAccountEasy extends AbstractBankAccount {
    public BankAccountEasy(String IBAN, double balance) {
        super(IBAN, balance, 0.0, 0.0);
    }

    @Override
    public double withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        double amountWithdrawn = Math.min(balance, amount);
        balance -= amountWithdrawn;
        return amountWithdrawn;
    }

    @Override
    public double transfer(BankAccount other, double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        String countryCode1 = this.IBAN.substring(0, 2);
        String countryCode2 = other.getIBAN().substring(0, 2);

        if (!countryCode1.equals(countryCode2)) {
            throw new IllegalArgumentException("International transfers are not allowed ");
        }
        double amountTransferred = this.withdraw(amount);
        other.deposit(amountTransferred);
        return amountTransferred;
    }
}
