package com.example.test;

public class Lamp {

    private String manufacturer;
    private String color;
    private int power;


    public Lamp(String manufacturer, String color, int power) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.power = power;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }
}
