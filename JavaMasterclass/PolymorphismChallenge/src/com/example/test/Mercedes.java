package com.example.test;

public class Mercedes extends Car{

    public Mercedes(int cylinders, String name) {
        super(4, "CLK");
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
        return "Mercedes -> Start";
    }

    @Override
    public String accelerate() {
        return "Mercedes -> Accelerate";
    }

    @Override
    public String brake() {
        return "Mercedes -> Brake";
    }
}
