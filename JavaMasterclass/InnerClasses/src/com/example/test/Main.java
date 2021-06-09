package com.example.test;

public class Main {
    // There are four types of nested classes that you can use in java:
    // 1) static nested classes
    // 2) non-static nested classes (Inner classes)
    // 3) local class, that's an inner class that's defined inside of a scope
    // 4) anonymous class which is a nested class without a class name.



    public static void main(String[] args) {
        // Gear is an inner class to Gearbox, we need to specify like that,
        // we need to specify the outer class Gearbox.Gear then the instance of Gearbox
        // which we create and then . new Gear
	    GearBox mcLaren = new GearBox(6,3);
	    // OuterClass.InnerClass = InstanceOfOuterClass.new InnerClass(...);
	    GearBox.Gear first = mcLaren.new Gear(1, 12.3);
        System.out.println(first.driveSpeed(1000));

    }
}
