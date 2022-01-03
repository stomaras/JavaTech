package com.example.test;

/*
    Abstarct class can have member variables that are inherited,something that can't be done in interface.
    Interfaces can have variables, but they are all public static final variables, which essentially are gonna be constant
    values that should never change, with a static scope, they have to be static because non static variables require an instance.
    Interfaces cannot have constructor but abstract classes can
    All methods over the interface are automatically public, whereas the methods of an abstract class can have any visibility, private, protected, e.t.c

 */


public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // By creating abstract methods we are forcing the class that is ultimately gonna implement from this abstract class
    // to create those methods for us.
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
