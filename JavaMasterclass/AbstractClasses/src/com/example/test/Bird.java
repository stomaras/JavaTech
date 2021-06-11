package com.example.test;

// With the implementation of CanFly interface we actually get rid of the
// abstract method fly().
public abstract class Bird extends Animal implements CanFly{

    // Now birds can also fly, so it could be a good idea to add a fly method to our bird class.
    // But not all birds can fly, so implementing a fly method in the bird class is not a good idea.
    // Better idea would be to create an abstract Bird class that extends Animal, and also has an abstract fly method
    // that individual Bird objects can implement as they are able to.
    // So Bird is an abstract class that itself is extending from another abstract class
    // It's implementing the required methods that the Animal class requires to,
    // namely eat and breathe.But it's also defining an abstarct method fly. That
    // ultimately has to be overriden by another class as well.

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking ");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    // Implement that from CanFly Interface.
    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
