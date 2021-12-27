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
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
       Customer customer = new Customer(customerName, initialTransaction);
       if (findCustomer(customerName) == null){
           System.out.println("New Customer added with name: " + customerName + " and initial transaction: " + initialTransaction);
           this.customers.add(customer);
           return true;
       }
       System.out.println("Customer with name: " + customerName + " already exists in the current branch");
       return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            System.out.println("For customer : " + customerName + " we have a new transaction : " + transaction);
            customer.addTransaction(transaction);
            return true;
        }
        System.out.println("Customer with name: " + customerName + " doesn't exist in this branch");
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
