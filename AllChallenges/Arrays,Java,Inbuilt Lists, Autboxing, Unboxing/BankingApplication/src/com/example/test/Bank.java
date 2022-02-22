package com.example.test;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String nameOfBranch) {
        if (findBranch(nameOfBranch) != null){
            return false;
        }
        this.branches.add(new Branch(nameOfBranch));
        return true;
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initialTransaction) {
        Branch branch = findBranch(nameOfBranch);
        if (branch != null){
            if (branch.newCustomer(nameOfCustomer, initialTransaction)){
                return true;
            }
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transaction) {
        Branch branch = findBranch(nameOfBranch);
        if (branch != null){
            if (branch.addCustomerTransaction(nameOfCustomer, transaction)){
                return true;
            }
        }
        return false;
    }

    private Branch findBranch(String nameOfBranch){
        for (int i = 0; i < this.branches.size(); i++){
            Branch branch = this.branches.get(i);
            if (branch.getName().equals(nameOfBranch)){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String nameOfBranch, boolean printTransactions) {
        Branch branch = findBranch(nameOfBranch);
        if (branch != null){
            System.out.println("Customer details for branch " + branch.getName() + "\n");
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++){

                Customer customer = branchCustomers.get(i);
                System.out.println("Customer: " + "["+ customer.getName() + "]" + "\n");
                if (printTransactions){
                    System.out.println("Transactions \n");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++){
                        System.out.println("["+ j +"]" + " Amount " + transactions.get(j) + "$");
                    }
                }
            }
            return true;
        }
        return false;
    }



}
