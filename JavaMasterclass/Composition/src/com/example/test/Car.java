package com.example.test;

public class Car extends Vehicle {
    private int doors;
    private int engineCapacity;

    // Car is-a relationship with vehicle
    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

}
