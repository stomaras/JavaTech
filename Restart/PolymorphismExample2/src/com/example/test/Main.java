package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here\
        Car car = new Car(4,"Base car");
        Mitsubishi mitsubishi = new Mitsubishi(4,"Mitsubishi");
        Car car1 = new Mitsubishi(4,"Mits");

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        System.out.println(car1.startEngine());
        System.out.println(car1.accelerate());
        System.out.println(car1.brake());

    }
}
