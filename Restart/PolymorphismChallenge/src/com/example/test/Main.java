package com.example.test;

    class Car {
        private int wheels;
        private boolean engine;
        private int cylinders;
        private String cylinderNames;

        public Car(int cylinders, String cylinderNames) {
            this.cylinders = cylinders;
            this.cylinderNames = cylinderNames;
            this.wheels = 4;
            this.engine = true;
        }

        public int getCylinders() {
            return cylinders;
        }

        public String getCylinderNames() {
            return cylinderNames;
        }

        public String startEngine(){
            return "Engine starts...";
        }

        public String accelerate(){
            return "Accelerate now...";
        }

        public String brake(){
            return"Brake now...";
        }
    }

    class Porsche extends Car {
        public Porsche(int cylinders, String cylinderNames) {
            super(cylinders, cylinderNames);
        }

        @Override
        public String startEngine() {
            return "Porsche -> Engine start.";
        }

        @Override
        public String accelerate() {
            return "Porsche -> acceleration.";
        }

        @Override
        public String brake() {
            return "Porsche -> brake.";
        }
    }

    class Mercendes extends Car {
        public Mercendes(int cylinders, String cylinderNames) {
            super(cylinders, cylinderNames);
        }

        @Override
        public String startEngine() {
            return "Mercendes -> Engine start.";
        }

        @Override
        public String accelerate() {
            return "Mercendes -> acceleration.";
        }

        @Override
        public String brake() {
            return "Mercendes -> brake.";
        }
    }

    class Audi extends Car {
        public Audi(int cylinders, String cylinderNames) {
            super(cylinders, cylinderNames);
        }

        @Override
        public String startEngine() {
            return "Audi -> Engine start.";
        }

        @Override
        public String accelerate() {
            return "Audi -> acceleration.";
        }

        @Override
        public String brake() {
            return "Audi -> brake.";
        }
    }

public class Main {

    public static void main(String[] args) {
	// write your code here
        // We are going to go back to the car analogy
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generic class.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4 and engine to true.
        // Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).
        Car car = new Car(4,"something");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Porsche porsche = new Porsche(6,"Porsche");
        Car car1 = new Audi(4, "edfi");
        System.out.println(car1.accelerate());
        System.out.println(car1.brake());


    }


}
