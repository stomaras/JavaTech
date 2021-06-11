package com.example.test;

// By creating abstract methods, we are actually forcing the class that is ultimately
// gonna implement from this abstract class to create those methods for us.
// These abstract methods eat() and breathe() have to be implemented.


public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // certain methods are abstract as you can see there.
    // Animal can eat and breathe. These methods could be interface as well
    // but as these methods are really common to all animals.
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
