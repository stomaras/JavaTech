package com.example.test;

public class DogMain {
    /**
     * Labrador is an instance of Dog, but dog though is not an instance of labrador,
     * Best way is not override equals method in Labrador.
     * @param args
     */
    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));
    }
}
