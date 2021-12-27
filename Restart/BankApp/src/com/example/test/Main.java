package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Bank bank = new Bank("Alpha Bank");
       bank.addBranch("Agrinio");
       bank.addBranch("Karpenisi");
       bank.addBranch("Lamia");
       bank.addCustomer("Lamia","Spyros", 15.00);
       bank.addCustomer("Lamia","Kostas", 15.00);
       bank.addCustomer("Lamia","Chris",12.00);
       bank.addCustomerTransaction("Lamia","Spyros",24.98);
       bank.addCustomerTransaction("Lamia", "Ntinos", 54.65);
    }
}
