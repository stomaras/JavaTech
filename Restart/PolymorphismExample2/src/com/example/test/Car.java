package com.example.test;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine(){
        return "Car Engine started...";
    }

    public String accelerate(){
        return "Car accelerating now...";
    }

    public String brake(){
        return "Car is braking now...";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
