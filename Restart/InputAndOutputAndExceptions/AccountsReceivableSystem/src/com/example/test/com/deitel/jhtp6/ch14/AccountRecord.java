package com.example.test.com.deitel.jhtp6.ch14;

public class AccountRecord {

    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    // no - argument constructor calls other constructor with default values
    public AccountRecord() {
        this(0, "", "", 0.0);
    }

    public AccountRecord(int account, String firstName, String lastName, double balance) {
        setAccount(account);
        setFirstName(firstName);
        setLastName(lastName);
        setBalance(balance);
    }

    public int getAccount() {
        return account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
