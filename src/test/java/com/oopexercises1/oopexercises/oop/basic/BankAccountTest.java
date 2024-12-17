package com.oopexercises1.oopexercises.oop.basic;

import com.oopexercises.oop.basic.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {
    BankAccount bankAccount;

    @BeforeEach
    void setUp(){
        bankAccount = new BankAccount(1000);
    }

    @Test
    void getBalance() {
        assertEquals(1000, bankAccount.getBalance());
        BankAccount emptyBankAccount = new BankAccount();
        assertEquals(0, emptyBankAccount.getBalance());
    }

    @Test
    void deposit() {
        bankAccount.deposit(1000);
        assertEquals(2000, bankAccount.getBalance());
    }

    @Test
    void withdraw() {
        bankAccount.withdraw(1000);
        assertEquals(0, bankAccount.getBalance());
    }
}
