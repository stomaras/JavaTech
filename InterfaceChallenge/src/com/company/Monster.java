package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Monster implements ISaveable{

    private String name;
    private int hitPoints;
    private int strength;

    private static Scanner scanner = new Scanner(System.in);
    private static List<String> monsters = new ArrayList<String>();
    public Monster(){};

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1,"" + this.hitPoints);
        values.add(2,"" + this.strength);
        return values;
    }



    @Override
    public void read(List<String> savedValues) {

    }
}
