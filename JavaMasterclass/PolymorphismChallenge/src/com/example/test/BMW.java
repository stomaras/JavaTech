package com.example.test;

public class BMW extends Car{

    public BMW(int cylinders, String name) {
        super(4, "Z4");
    }

    @Override
    public int getCylinders() {
        return super.getCylinders();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String startEngine() {
        return "BMW -> Start";
    }

    @Override
    public String accelerate() {
        return "BMW -> Accelerate";
    }

    @Override
    public String brake() {
        return "Bmw -> Brake";
    }
}
