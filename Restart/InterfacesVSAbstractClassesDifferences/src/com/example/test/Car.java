package com.example.test;

/**
 * Whenever we create an nterface we need to achieve full abstraction.
 * Interface -> 100% Abstraction. -> only abstract methods -> no method body
 * Can not create the object of car interface
 * Only final and static vars defined in interface.
 */
public interface Car {
    final int wheels = 4;

    public void start();
    public void stop();
    public void refuel();
}
