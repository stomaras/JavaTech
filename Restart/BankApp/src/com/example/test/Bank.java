package com.example.test;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addBranch(String branchName) {
        Branch branch = new Branch(branchName);
        if (findBranch(branchName) == null){
            this.branches.add(branch);
            System.out.println("New Branch added with name: " + branchName);
            return true;
        }
        System.out.println("Branch with name: " + branchName + " already exists!");
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if (branch != null){
            System.out.println("For branch: " + branchName + " : ");
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        System.out.println("Customer details for branch : " + branchName);
        Branch branch = findBranch(branchName);
        if (branch != null){
            ArrayList<Customer> customers = branch.getCustomers();
            for (int i = 0; i < customers.size(); i++) {
                Customer customer = customers.get(i);
                System.out.println("Customer: " + customer.getName() + "["+(i+1)+"]");
                if (printTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (int j = 0; j < transactions.size(); j ++) {
                        System.out.println("["+(j+1)+"]" + "Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }

    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }
}
