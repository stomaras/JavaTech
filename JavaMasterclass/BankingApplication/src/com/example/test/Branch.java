package com.example.test;

import java.util.ArrayList;

public class Branch {

    // - it has two fields, A String called name and an ArrayList that holds objects of type Customer called customers.
    // - A constructor that takes a String (name of the branch). It initialises name and instantiates customers.
    // - And five methods, they are(their functions are in their names):
    //    - getName(), getter for name.
    //    - getCustomers(), getter for customers.
    //    - newCustomer(), has two parameters of type String (name of customer), double (initial transaction) and returns a boolean. Returns true if the customer was added successfully
    //                     or false otherwise.
    // - addCustomerTransaction(), has two parameters of type String (name of customer), double(transaction) and returns a boolean. Returns true if the customers was added successfully or false otherwise
    // - findCustomer(), has one parameter of type String (name of customer) and returns a Customer. Return the Customer if they exist, null otherwuise.

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        Customer customer = new Customer(customerName);
        for (int i = 0; i <= customers.size(); i++) {
            if (customers.contains(customer) ) {
                return false;
            }
        }
        customers.add(customer);
        return true;
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer customer = new Customer(customerName);
        ArrayList<Double> transactions = customer.getTransactions();
        for (int i = 0; i < transactions.size(); i++){
            if(transactions.add(transaction) == false){
                return false;
            }
        }
        return true;
    }

    public Customer findCustomer(String customerName){
        Customer customer = new Customer(customerName);
        if (customers.indexOf(customer) < 0){
            return null;
        } else {
            return customer;
        }
    }


}
