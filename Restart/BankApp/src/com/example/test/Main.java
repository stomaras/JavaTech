package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Bank bank = new Bank("Alpha Bank");

       bank.addBranch("Agrinio");

       bank.addCustomer("Agrinio", "Tom", 15.00);
       bank.addCustomer("Agrinio", "Chris", 15.00);
       bank.addCustomer("Agrinio", "Kostas", 15.00);

       bank.addCustomerTransaction("Agrinio", "Tom", 34.00);
       bank.addCustomerTransaction("Agrinio", "Tom", 24.00);
       bank.addCustomerTransaction("Agrinio", "Chris", 23.00);
       System.out.println("\n");
       bank.listCustomers("Agrinio", true);

    }
}
