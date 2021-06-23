package com.example.test;

public class DogMain {
    public static void main(String[] args) {
        // So gonna create a pet Labrador called rover so rover is found
        // wondering by the dog warden who reads her collar and decides she is a dog
        // called Rover
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        // Labrador is an instance of dog but dog though is not an instance of
        // Labrador
        // Best way to fix is not override the equals method in Labrador so we can
        // Now to ensure that equals can not be overriden in sub classes of dog what
        // we want to do to confirm that we would is to actually go back to the dog class
        // and marked that as final... so we are making that as final and we are saying
        // that this method can not b overriden at that point so that's one way to really
        // make sure that the equals can't b overriden and we can't get into the problems that
        // we just had so what
        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));


    }
}
