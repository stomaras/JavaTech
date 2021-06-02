package com.example.test;
// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generic car class.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).




public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 1; i <= 3; i++) {
            Car car = randomCar();
            System.out.println(" Car# " + i + "\n" +
                            "Car name is " + car.getName() + "\n" +
                            "Now " + car.accelerate() + "\n" +
                            "Now " + car.brake() + "\n"
                    );
        }

    }
    public static Car randomCar(){
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Porsche(4, "Carrera");
            case 2:
                return new Mercedes(4, "CLK");
            case 3:
                return new BMW(4, "Z4");
            default:
                return null;
        }
    }

}
