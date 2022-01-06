package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account account = new Account("Tom");
        account.deposit(45);
        account.deposit(23);
        account.deposit(123);
        account.withdraw(23);
        account.withdraw(-100);
        account.calculateBalance();
    }
}
