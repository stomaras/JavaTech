package com.example.test;

public class Ceiling {

    private String type;
    private String color;
    private int diameter;

    public Ceiling(String type, String color, int diameter) {
        this.type = type;
        this.color = color;
        this.diameter = diameter;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Ceiling{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
