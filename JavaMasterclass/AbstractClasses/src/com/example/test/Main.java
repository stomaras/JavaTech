package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Abstraction is when you define the required functionality for
        // something without actually implementing the details. In other words
        // we are focusing on what needs to be done, not on the how it's to be done
        // So interface is, as you saw are purely abstract and they do not specify any actual
        // aspect of the implementation. The actual implementation was left to the classes that implement
        // the interface, and that's why we use the word implements when we are using an interface
        // Interface defines what is need to be done. It does not define how it's done.
        // The how, we actually  have to go into the class, in this case Monster and
        // implements the Isaveable interface
        //
        // Abstract classes provide methods but do not provide an implementation
        // of those methods. You can also inherit from an class itself

        // Note !!! -> You can not instantiate a class that is abstract in anyway.
        // So what we need to do is actually create another class. So to do that
        // we will change this, and we will actually create a Parrot class.
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        // Which is the difference between an abstract class and an interface, and how
        // do you actually go about deciding which one to use. We need to consider
        // the relationships, the relationships is-a vs has-a, or can. So in other words
        // dog is an animal, and a bird is an animal. That makes sense to inherit from
        // an animal class, rather than implementing an actual animal interface.
        // Birds aren't the only animals that can fly.Bats are extremely good at it.
        // for example, and even dragonflies are and that's just two examples.
        // Bu a bat is not a bird though. To get around that we could rename our
        // bird class flying animals, and have bats and bird both inherit from that
        // But it should be easy to see the problems that could potentially cause.
        // Now, bats give brth to young eather than laying eggs. This may lead to having
        // flying animals being inherited by classes called mammals and birds.
        // Where we actually went wrong here was actually putting the fly method in the
        // bird class. A bird can fly and a bat can fly. A better design would be to have
        // created a can fly interface, which both bats and birds can implement.
        //
        //
        // Abstract class vs Interface
        //   can have member variables that are inherited, something that
        //   can not be done in interface. Now interfaces can have variables
        //   , but they are all public static final variables, which essentially
        //   are gonna be constant values that should never change, with
        //   a static scope.
        //   They have to be static, because non static variables require
        //   an instance, and of course you can not instantiate an interface.
        //   Interfaces also cannot have constructors, but abstract classes can,
        //   as you have actually seen in this example.
        //   Now all methods over the interface are automatically public.
        //   Whereas the methods of an abstract class can have any visibility.
        //   Private, Protected, etcetera. Abstarct classes can have defined methods
        //   methods with an implementation. Whereas all methods in an interface are abstract.
        //   


    }
}
