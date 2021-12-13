package com.example.test;

public class Bed {

    private String material;
    private int width;
    private int length;
    private String size;
    private String color;

    public Bed(String material, int width, int length, String size, String color) {
        this.material = material;
        this.width = width;
        this.length = length;
        this.size = size;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "material='" + material + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
