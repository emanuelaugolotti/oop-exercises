package com.oopexercises1.oop.bankaccount;

public interface BankAccount {
    String getIBAN();

    void setIBAN(String IBAN);

    double getBalance();

    void setBalance(double balance);

    double getOperationFee();

    void setOperationFee(double operationFee);

    double getInterestRate();

    void setInterestRate(double interestRate);

    void deposit(double amount);

    double withdraw(double amount);

    double transfer(BankAccount other, double amount);

    void addInterest();

    void applyFee();

    static void checkIBAN(String IBAN) {

//        if (IBAN.length() < 8 || IBAN.length() > 34) {
//            throw new IllegalArgumentException("Invalid length");
//        }
//        String countryCode = IBAN.substring(0, 2);
//        if (!(Character.isLetter(countryCode.charAt(0)) && Character.isLetter(countryCode.charAt(1)))) {
//            throw new IllegalArgumentException("Invalid country code");
//        }
//        if (!(Character.isUpperCase((int)countryCode.charAt(0)) && Character.isUpperCase((int)countryCode.charAt(1)))) {
//            throw new IllegalArgumentException("Invalid country code");
//        }


        if (IBAN.length() < 8 || IBAN.length() > 34) {
            throw new IllegalArgumentException("A valid IBAN must have a length comprised between 8 and 34 characters");
        }
        if (!Character.isLetter(IBAN.charAt(0)) || !Character.isLetter(IBAN.charAt(1))) {
            throw new IllegalArgumentException("The first two characters of IBAN must be a valid country code");
        }
        if (!Character.isUpperCase(IBAN.charAt(0)) || !Character.isUpperCase(IBAN.charAt(1))) {
            throw new IllegalArgumentException("The first two characters of IBAN must be a valid country code");
        }
    }
}
