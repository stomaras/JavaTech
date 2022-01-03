package com.example.test;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    /*
        I want to implement some specific functionalityn for the penguin class.
     */
    @Override
    public void fly() {
        super.fly();
        System.out.println("I can not fly !");
    }
}
