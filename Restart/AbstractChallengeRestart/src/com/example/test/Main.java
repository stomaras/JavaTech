package com.example.test;

public class Main {

    /*
        Difference between Abstract Class and Interface

        Abstarct classes are similar to Interfaces.You cannot instantiate them, and they may
        contain a mix of methods declared with or without an implementation.

        However, with Abstract classes, you can declare fields that are not static and final, and define public, protected,
        and private concrete methods.

        An Abstract class can extend only one parent class but it can implement multiple interfaces.

        An interface is just the declaration of methods of an Class, it's not the implementation.

        In an Interface, we define what kind of operation an object can perform. These operations are defined by the
        classes that implement the Interface.

        Interfaces form a contract between the class and the outside world, and this contract is enforced at build time
        by the compiler.

        You cannot instantiate them, and they may contain a mix of methods declared with or without an implementation.
        All methods in interfaces are automatically public and abstract

        An interface can extend another interface.
     */
















    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
    }
}
