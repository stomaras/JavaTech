package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class Monster {
    private String name;
    private int hitPoints;
    private int strength;

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
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    public List<String> write() {
        List<String> monsters = new ArrayList<>();
        monsters.add(name);
        monsters.add("" + hitPoints);
        monsters.add("" + strength);
        return monsters;
    }

    public void read(List<String> list){
        if (list != null && list.size() > 0){
            String name = list.get(0);
            int hitPoints = Integer.parseInt(list.get(1));
            int strength = Integer.parseInt(list.get(2));
        }
    }
}
