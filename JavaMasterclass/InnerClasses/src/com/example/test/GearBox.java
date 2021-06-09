package com.example.test;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public GearBox(int maxGears, int gearNumber) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    // Inner Class Gear
    // Gear class itself is a member of Gearbox, it must be created
    // within instance of it.
    // Inner Class is something you do not want people to normally directly access anyway.
    // So in other words, the instance is gonna be created by the other class.
    // So making this class gear private makes sense here, because we are not actually
    // interested in the individual gear objects we are driving. We wanna change the gear
    // but we do that by interacting with the gearbox not with the idividual gears.
    // So in other words, your public interface that you are exposing to your
    // program here would be gearbox, you would not be exposing gear directly,
    // you had be exposing the fact that you can actually change gears, but you won't
    // be interacting with the gears itself, if that makes sense.

    // We can actually add gears to our gearbox object which will be adding gears to
    // the array list automatically. And to show you how to change gear as well,
    // all done from the outer class, in this case gearbox.

    // A way to operate clutch as a method
    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

    // we will also add the other method which is the ability to add gears to our
    // gearbox
    public void addGear(int number, double ratio) {
        if ((number > 0) && (number <= maxGears)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if ((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        }else{
            // you are getting weird sound you get from the manual when you
            // are trying to do that.
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    // In order to determine the speed
    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }




    class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }
}
