package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CustomerThread c1 = new CustomerThread("Customer Thread-1");
        CustomerThread c2 = new CustomerThread("Customer Thread-2");
        CustomerThread c3 = new CustomerThread("Customer Thread-3");
        CustomerThread c4 = new CustomerThread("Customer Thread-4");

        // For every Customer Thread a seperate Transaction ID must be required
        // For every Thread a seperate Transaction ID i want to maintain, then
        // how many ThreadLocal Objects are required? One ThreadLocal Object for
        // every Thread a seperate id it can be able to maintain
        c1.start();
        c2.start();
        c3.start();
        c4.start();

    }
}
