package com.example.test;

public class Ceiling {
    private String paintedColor;
    private int height;



    public Ceiling(String paintedColor, int height) {
        this.paintedColor = paintedColor;
        this.height = height;
    }

    public String getPaintedColor() {
        return paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public void getCeiling(){
        System.out.println("Ceiling done");
    }


    @Override
    public String toString() {
        return "Ceiling{" +
                "paintedColor='" + paintedColor + '\'' +
                ", height=" + height +
                '}';
    }
}
