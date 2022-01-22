package com.example.test;

public class StaticPolymorphism {
    /**
     * two ways in order to perform overloading
     * 1st : change number of arguments
     * 2nd : change type of arguments
     */
    public void add(int a, int b) {
        System.out.println("add method with 2 arguments " + (a + b));
    }


    public void add(int a, int b, int c) {
        System.out.println("add method with 3 arguments " + (a + b + c));
    }

    public void add(int a, long b) {
        System.out.println("add method with 3 arguments " + (a+b));
    }
}
