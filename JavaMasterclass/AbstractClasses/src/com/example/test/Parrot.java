package com.example.test;

public class Parrot extends Bird{

    // We can still override methods eat() and breathe(), if this bird has
    // another way of eating and breathing.But really, all we wanna do iss override fly in this case.
    // to make this class valid.
    // Again parrots automatically inheriting eat and breathe from the Bird class.
    public Parrot(String name) {
        super(name);
    }

    // we do not need this method because we can implement CanFly() interface.
    //@Override
    //public void fly() {
    //    System.out.println("Flitting from branch to branch");
    //}
}
