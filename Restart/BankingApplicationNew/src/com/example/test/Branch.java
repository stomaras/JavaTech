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

    public boolean newCustomer(String newName, double transaction) {
        if (findCustomer(newName) == null){
            Customer customer = new Customer(newName);
            this.customers.add(customer);
            return true;
        }
        return false;

    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer customer = findCustomer(customerName);
        if (customer == null){
            System.out.println("Customer : " + customerName + " does not exist in this branch");
            return false;
        }
        customer.addTransaction(transaction);
        System.out.println("Customer : " + customerName + " add new transaction: " + transaction + " euro.");
        return true;

    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++){
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(customerName)){
                return customer;
            }
        }
        return null;
    }
}
