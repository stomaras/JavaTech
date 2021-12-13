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

    @Override
    public String toString() {
        return "Wall{" +
                "height=" + height +
                ", length=" + length +
                '}';
    }
}
