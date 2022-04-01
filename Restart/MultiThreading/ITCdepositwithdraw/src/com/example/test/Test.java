package com.example.test;

public class Test {
    int amount = 10000;

    synchronized void withdraw(int amount){
        System.out.println("going to withdraw...");

        if (this.amount < amount){
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (InterruptedException e){

            }
        }
        this.amount = this.amount - amount;
        System.out.println("WithDraw Completed...");
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit...");
        this.amount = this.amount + amount;
        System.out.println("deposit completed...");
        notify();
    }
}
