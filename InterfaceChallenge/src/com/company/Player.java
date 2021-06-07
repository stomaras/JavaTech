package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    private static Scanner scanner = new Scanner(System.in);

    public Player(){};

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }


    @Override
    public List<String> write() {
        //List<String> list = new ArrayList<String>();// List<String> list = new ArrayList<>();
        List<String> list = new ArrayList<String>();
        System.out.println("Enter a player name: \n" );
        String playerName = scanner.nextLine();
        list.add(0,playerName);
        System.out.println("Enter player hit points: \n ");
        int playerHitPoints =  scanner.nextInt();
        list.add(1,"" + playerHitPoints);
        System.out.println("Enter player strength: \n");
        int playerStrength = scanner.nextInt();
        list.add(2,"" + playerStrength);
        return list;
        //list.add(0,"Yu-gi-oh");
        //list.add(1,"Dark-Magician");
        //list.add(2,"" + 2000);
        //list.add(3,"" + 2500);
    }

    @Override
    public void read(List<String> list) {

        if ((list != null) && (list.size() > 0)){
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
        }
        //if ((list != null) && (list.size() > 0)){
        //    this.name = list.get(0);
        //    this.weapon = list.get(1);
        //    this.hitPoints = Integer.parseInt(list.get(2));
        //    this.strength = Integer.parseInt(list.get(3));
        //}
    }
}
