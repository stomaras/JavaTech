package com.example.test;

public class Porsche extends Car{

    public Porsche(int cylinders, String name) {
        super(4, "Carrera");
    }

    @Override
    public String startEngine() {
        return "Porsche -> Start";
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
    public String accelerate() {
        return "Porsche -> Accelerate";
    }

    @Override
    public String brake() {
        return "Porsche -> Brake";
    }
}
