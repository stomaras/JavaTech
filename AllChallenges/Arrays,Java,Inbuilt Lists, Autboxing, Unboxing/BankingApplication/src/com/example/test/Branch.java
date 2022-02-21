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

    public boolean newCustomer(String nameOfCustomer, double initialAmount){
        Customer newCustomer = new Customer(nameOfCustomer, initialAmount);
        for (int i = 0; i < this.customers.size(); i++){
            Customer customer = this.customers.get(i);
            if (customer.equals(newCustomer)) {
                return false;
            }
        }
        this.customers.add(newCustomer);
        return true;
    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transaction){
        Customer newCustomer = new Customer(nameOfCustomer, transaction);
        for (int i = 0; i < this.customers.size(); i++){
            Customer customer = this.customers.get(i);
            if (customer.equals(newCustomer)) {
               this.customers.get(i).addTransaction(transaction);
               return true;
            }
        }
        return false;
    }

    private Customer findCustomer(String nameOfCustomer) {
        Customer newCustomer = new Customer(nameOfCustomer, 0);
        for (int i = 0; i < this.customers.size(); i++){
            Customer customer = this.customers.get(i);
            if (customer.equals(newCustomer)){
                return customer;
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
