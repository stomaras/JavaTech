package com.example.test;

public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Start Engine ... ";
    }

    public String accelerate(){
        return "Vehicle accelerate now ... ";
    }

    public String brake(){
        return "Vehicle stop now ...";
    }
}
