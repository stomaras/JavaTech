package com.example.test;
// A Room has-a Wall
// A Room has-a Bed
// A Room has-a Ceiling
// A Rooom has-a Lamp
public class Room {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Bed bed;
    private Ceiling ceiling;
    private Lamp lamp;

    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Bed bed, Ceiling ceiling, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.bed = bed;
        this.ceiling = ceiling;
        this.lamp = lamp;
    }

    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Bed getBed() {
        return bed;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Lamp getLamp() {
        return lamp;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", wall1=" + wall1 +
                ", wall2=" + wall2 +
                ", wall3=" + wall3 +
                ", wall4=" + wall4 +
                ", bed=" + bed +
                ", ceiling=" + ceiling +
                ", lamp=" + lamp +
                '}';
    }
}
