package com.example.test;

public class Frog implements Animal, TerrestrialAnimal, AquaticAnimal{

    @Override
    public void specialCapabilities() {
        System.out.println("Frog is an Amphibian animal");
        System.out.println("Frog lives in both land and water");
    }

    @Override
    public void livesIn() {
        System.out.println("Frog is an Amphibian animal and hence can live on land as well as water");
    }
}
