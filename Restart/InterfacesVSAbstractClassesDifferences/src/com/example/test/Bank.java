package com.example.test;

/**
 * Whenever you want to define a particular abstract class in abstract class at
 * least one method should be there ok which is abstarct in nature.
 * abstarct method means : only method declaration, no method body
 *
 * Partial Abstraction : means we do not achieving 100% abstraction
 * Abstraction means : hiding the implementation logic
 *
 * Abstract class can have abstract methods and non abstarct methods
 *
 * Cannot create the object abstract class
 */
public abstract class Bank {

    int amount = 100;
    final int rate = 10;
    static int loanRate = 5;

    public abstract void loan();// abstract method -- no method body


    // non abstract methods
    public void credit() {
        System.out.println("Bank -- Credit");
    }

    public void debit() {
        System.out.println("Bank -- debit");
    }


}
