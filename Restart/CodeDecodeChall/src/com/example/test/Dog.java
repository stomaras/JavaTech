package com.example.test;

public class Dog extends Animals{

    private String color;
    private String name;
    private String breed;
    private int age;

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void wagTail() {
        System.out.println("Dog wag their tails");
    }

    public void barking() {
        System.out.println("Dog barks");
    }

    public void eating() {
        System.out.println("Dog eats");
    }

    public void specialCapabilities()
    {
        System.out.println("Dog Barks");
    }
}
