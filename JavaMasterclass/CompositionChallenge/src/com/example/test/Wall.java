package com.example.test;

public class Wall {
    private int height;
    private int length;

    public Wall(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void wallMethod(){
        System.out.println("Wall method making");
    }

    @Override
    public String toString() {
        return "Wall{" +
                "height=" + height +
                ", length=" + length +
                '}';
    }
}
