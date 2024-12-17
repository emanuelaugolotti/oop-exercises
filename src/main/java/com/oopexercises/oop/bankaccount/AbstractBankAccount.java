package com.oopexercises.oop.bankaccount;

public abstract class AbstractBankAccount implements BankAccount {

    protected String IBAN;
    protected double balance;
    protected double operationFee;
    protected double interestRate;

    public AbstractBankAccount(String IBAN, double balance, double operationFee, double interestRate) {
        setIBAN(IBAN);
        setBalance(balance);    //
        setOperationFee(operationFee);
        this.interestRate = interestRate;
    }

    @Override
    public String getIBAN() {
        return IBAN;
    }

    @Override
    public void setIBAN(String IBAN) {
        BankAccount.checkIBAN(IBAN);
        this.IBAN = IBAN;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getOperationFee() {
        return operationFee;
    }

    @Override
    public void setOperationFee(double operationFee) {
        if (operationFee < 0.0) {
            throw new IllegalArgumentException("Negative values are not allowed for this operation");
        }
        this.operationFee = operationFee;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0.0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        balance += amount;
    }

    abstract public double withdraw(double amount);

    @Override
    public double transfer(BankAccount other, double amount) {
        if (amount < 0.0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        double amountTransferred = this.withdraw(amount);
        other.deposit(amountTransferred);
        return amountTransferred;
    }

    @Override
    public void addInterest() {
        balance += interestRate * balance / 100;
    }

    @Override
    public void applyFee() {
        balance -= operationFee;
    }
}
