package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // In java is possible to nest a class inside another class.
        // 4 types of nested classes
        // 1) static nested classes
        // 2) non static nested classes (inner class)
        // 3) anonymous class which is a nested class without a class name

        // We are actually have a gearbox class and a gear class.
        // static nested class is mainly used to associate a class with its outer class.
        // it's packaged in its outer class rather than in the package
        // that really means that it cannot access the nonstatic methods or members of its outer class
        // without first creating an instance of that class.
        // Non-static nested class or inner class because these are quite useful.

        // Another thing to keep in mind is that often though the inner class is gonna be private anyway.
        // So in other words instances will only br created by the outer class.

        // Public interface that you exposing to the program here is the GearBox, you would not
        // be exposing gear directly,

        // Gear class is a class which you don't want people to normally directly access anyway.
        // Making class Gear private make sense here because we are not actually interested in
        // the individual gear objects we are driving, we want to change the Gear, but we do that by interacting with the
        // gearbox not with the individual gears.

        // There are two special cases of inner classes and that's local classes
        // and anonymous classes.

        GearBox mcLaren = new GearBox(6);
        mcLaren.addGear(1, 5.3);
        mcLaren.addGear(2, 10.6);
        mcLaren.addGear(3, 15.9);
        mcLaren.addGear(4, 17.8);
        mcLaren.operateClutch(true);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(4);
        mcLaren.operateClutch(false);
        mcLaren.changeGear(2);
    }
}
