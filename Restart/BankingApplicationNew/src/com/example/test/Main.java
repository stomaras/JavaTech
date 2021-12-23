package com.example.test;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Bank bank = new Bank("Alpha Bank");
       bank.addBranch("Agrinio");
       bank.addBranch("Agrinio");
       bank.addBranch("Karpenisi");

       Branch branch = new Branch("Agrinio");
       branch.newCustomer("Spyros", 45.78);
       branch.addCustomerTransaction("Spyros", 50.89);
       branch.addCustomerTransaction("Spyros", 45.98);
       branch.addCustomerTransaction("Spyros", 41.98);
       branch.newCustomer("Chris", 800.00);
       branch.addCustomerTransaction("Chris",23.92);
       branch.addCustomerTransaction("Chris",78.34);
       branch.newCustomer("Kostas", 15.00);
       branch.addCustomerTransaction("Kostas", 68.93);

       ArrayList<Customer> customers = branch.getCustomers();
       System.out.println("Customer details for branch : " + branch.getName());
       for (int i = 0; i < customers.size(); i++) {
           Customer customer = customers.get(i);
           System.out.println("Customer: " + customer.getName()+ "["+ i +"]");
           System.out.println("Transactions ");
           ArrayList<Double> transactions = customer.getTransactions();
           for (int j = 0; j < transactions.size(); j++) {
               System.out.println(" ["+j+"] " + " Amount " + transactions.get(j));
           }
       }




    }
}
