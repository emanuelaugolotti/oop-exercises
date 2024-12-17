package com.oopexercises.oop.bankaccount;

public class BankAccountPro extends AbstractBankAccount {

    public BankAccountPro(String IBAN, double balance) {
        super(IBAN, balance, 1.0, 2.0);
    }

    @Override
    public double withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        balance -= amount;
        applyFee();
        return amount;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        applyFee();
    }
}
