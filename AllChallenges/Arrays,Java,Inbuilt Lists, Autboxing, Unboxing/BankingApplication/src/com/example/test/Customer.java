package com.example.test;

import java.util.ArrayList;
import java.util.Objects;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }

    public void printCustomerTransactions(){
        System.out.println("Customer: " + name + "\n");
        for (int i = 0; i < this.transactions.size(); i++){
            System.out.println((i + 1) + ".transaction: " + this.transactions.get(i) + "$");
        }
    }

    @Override
    public String toString() {
        String s = "Transactions of customer " + name + "\n";
        double totalTransactionsAmount = 0.0;
        for (int i = 0; i < this.transactions.size(); i++){
            double transaction = this.transactions.get(i);
            totalTransactionsAmount += transaction;
            s = s + i + ". transaction : " + transaction + "$" + "\n";
            System.out.println("\n");
        }
        s = s + "Total Transactions amount: " + totalTransactionsAmount + "$";
        return s;
    }
}
