package com.example.test;
/*
    Now interfaces can have variables, but they are all public static final variables, need to be static because
    non static variables are require an instance, and of course you can not instantiate an interface.
    Interfaces can not have a constructor but abstract classes can, as you've
    All methods of an interface are automatically public whereas the methods of an abstract class can have any visibility
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
