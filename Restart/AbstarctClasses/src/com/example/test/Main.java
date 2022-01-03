package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // You can not directly instantiate a class that is abstract in anyway.
        Dog dog = new Dog("Yorkie");
        dog.eat();
        dog.breathe();
        Parrot parrot = new Parrot("Australian ringneck");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

        // A dog is an animal.
        // A bird is an animal, that make sense to inherit from an abstarct class rather than implementing
        // an actual animal interface.
        // A bat can fly and a bird can cly so a better design would be to have created a can fly interface

    }
}
