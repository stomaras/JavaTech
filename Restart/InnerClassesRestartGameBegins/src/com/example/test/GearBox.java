package com.example.test;

    /*
        We will have an arrayList for the gears, number of gears and , also the gear number
     */

    /*
        In this case, it doesn't make sense to talk about gears unless it's within
        the context of a gearbox. That's why we modeled the gears using an inner class of the gear box class.
        Now instances of the gear class have got access to all the methods and fields of the outer gearbox class, even
        those mark as private
        GearNumber refer to the gearNumber of the Gear and not to the GearNumber of GearBox itself.
        So if you want refer to gearbox's gear number from an instance of the gear class, you have to use gearbox.this.gearNumber

        gearNumber of the Gear class is shadowing gearNumber of the GearBox class.

        GEAR class itself is a member of GearBox it must be created within instance of it.

        We are going to add a function for operating a clutch.

        We are actually add a method to add gears to our gearbox object will be adding gears to the
        arrayList automatically.

     */

import java.util.ArrayList;

public class GearBox {

    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    // add Gears to our GearBox object, so add gears to the ArrayList automatically.
    public void addGear(int number, double ratio) {
        if ((number > 0) && (number <= maxGears)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if ((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    private class Gear {

        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        // Number of revs as a parameter and multiply by the ratio to get the drive speed.
        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }

}




