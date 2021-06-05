package com.company;



import java.util.ArrayList;
// 1. Bank
// - it has two fields. A String called name and an ArrayList that holds objects of type Branch called branches.
// - A constructor that takes a String (name of the bank). It initialises name and instantiates branches.
// And five methods, they are (their functions are in their names):
// - addBranch(), has one parameter of type String (name of the branch) and returns a boolean. It returns true if the
// branch was added successfully or false otherwise.
// - addCustomer(), has three parameters of type String (name of the branch), String (name of the customer), double (initial transaction)
// and returns a boolean. It returns true if the customer was added successfully or false otherwise.
// - addCustomerTransaction(), has three parameters of type String(name of the branch), String(name of the customer), double(transaction)
// and returns a boolean. It returns true if the customer transaction was added successfully or false otherwise.
// - findBranch(), has one parameter of type String(name of the Branch) and returns a Branch. Return the Branch if it exists or null
// otherwise.
// - listCustomers(), has two parameters of type String(name of the Branch), boolean(print transactions) and returns a boolean. Return
// true if the branch exists or false otherwise. This method prints out a list of customers.
public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String nameOfBranch) {
        Branch newBranch = new Branch(nameOfBranch);
        if (findBranch(nameOfBranch) == null) {
            branches.add(newBranch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initialTransaction) {
        Customer newCustomer = new Customer(nameOfCustomer);
        Branch branch = new Branch(nameOfBranch);
        if (branch.findCustomer(nameOfCustomer) != null){

            return true;
        }
        return false;
    }



    public Branch findBranch(String nameOfBranch) {
        Branch branch = new Branch(nameOfBranch);
        int index = branches.indexOf(branch);
        if (index >= 0) {
            return branch;
        }
        return null;
    }




}
