package com.example.test;

/**
 * Whenever you are going to implement any abstract class or whenever you are going to
 * extend any abstract class, then we must implement the default method
 * Other non-abstract methods don't need to define over here.
 */
public class HDFCbank extends Bank{

    @Override
    public void loan() {
        System.out.println("HDFC--LOAN Method");
    }

    public void funds(){
        System.out.println("HDFC--Funds");
    }
}
