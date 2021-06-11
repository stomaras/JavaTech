package com.example.test;

// Not all methods have to be abstract.
// This is one of the differences between an abstract class
// and an interface, you can actually mix these up.
// Interface was completely abstract, and there is no implementation whatsoever
// so there is no opportunity for us to enter fields, we purely were able just
// to specify the methods thet we are gonna be used for that interface.



public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating ");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }
}
