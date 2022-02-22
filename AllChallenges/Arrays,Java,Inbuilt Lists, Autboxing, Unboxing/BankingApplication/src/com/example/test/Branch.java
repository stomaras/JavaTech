package com.example.test;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return new ArrayList<>();
    }

    public boolean newCustomer(String nameOfCustomer, double initialTransaction){
        Customer newCustomer = findCustomer(nameOfCustomer);
        if (newCustomer == null){
            this.customers.add(new Customer(nameOfCustomer, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transaction){
        Customer newCustomer = findCustomer(nameOfCustomer);
        if (newCustomer != null){
            newCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String nameOfCustomer) {
        for (int i = 0; i < this.customers.size(); i++){
            Customer checkedCustomer = this.customers.get(i);
            String customerName = checkedCustomer.getName();
            if (customerName.equals(nameOfCustomer)){
                return checkedCustomer;
            }
        }
        return null;
    }

    @Override
    public String toString() {
       String s = "Branch with name: " + name + "\n";
       double totalBranchAmount = 0.0;
       s = s + "\n";
       for (int i = 0; i < this.customers.size(); i++){
           Customer customer = this.customers.get(i);
           ArrayList<Double> transactions = customer.getTransactions();
           s = s + "Customer: " + customer.getName() + "\n";
           for (int j = 0; j < transactions.size(); j++){
               double transaction = transactions.get(j);
               s = s + "Amount [" + j + "] :" + transaction + "$" + "\n";
               totalBranchAmount += transaction;
           }
           s = s + "\n";
       }
       System.out.println("\n");
       s = s + "Total Branch Amount : " + totalBranchAmount + "$";
       return s;
    }
}
