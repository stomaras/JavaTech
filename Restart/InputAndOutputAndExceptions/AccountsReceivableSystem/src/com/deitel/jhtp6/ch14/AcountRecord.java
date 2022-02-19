package com.deitel.jhtp6.ch14;
// A class that represents one record of information.

public class AcountRecord {

    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    public AcountRecord(){
        this(0, "", "", 0.0);
    }
    // initialize a record
    public AcountRecord(int accountNumber, String firstName, String lastName, double balance) {
        setAccount(accountNumber);
        setFirstName(firstName);
        setLastName(lastName);
        setBalance(balance);
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
}
