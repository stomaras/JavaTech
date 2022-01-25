package com.example.test;
class Human{

}

class Doctor extends Human{

}

class Animal {

}

class Dog extends Animal {

}

class Bird {

}
public class Test {

    public static <T extends Human> void printInfo(T onlyHuman) {
        System.out.println("hey you are a human/Dog/Bird");
    }

    public static void main(String[] args) {
        printInfo(new Human());
        printInfo(new Doctor());
        //printInfo(new Dog());
    }



}
