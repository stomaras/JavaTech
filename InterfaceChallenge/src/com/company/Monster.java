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
        List<String> list = new ArrayList<String>();
        System.out.println("Enter a monster name: \n" );
        String monsterName = scanner.nextLine();
        list.add(0,monsterName);
        System.out.println("Enter monster hit points: \n ");
        int monsterHitPoints =  scanner.nextInt();
        list.add(1,"" + monsterHitPoints);
        System.out.println("Enter monster strength: \n");
        int monsterStrength = scanner.nextInt();
        list.add(2,"" + monsterStrength);

    return list;
    }

    @Override
    public void read(List<String> list) {
        if ((list != null) && (list.size() > 0)){
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
