package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Wall wall1 = new Wall(4,4);
        Wall wall2 = new Wall(4,4);
        Wall wall3 = new Wall(4,3);
        Wall wall4 = new Wall(4, 3);

        Ceiling ceiling = new Ceiling("green", 4);
        Bed bed = new Bed("double", 4, 1,2, 1);

        Lamp lamp = new Lamp("cyril", false, 9);

        Room room = new Room("Tom Room", wall1, wall2, wall3, wall4, bed, ceiling, lamp);

        room.getBed().BedMethod();
        room.getLamp().TurnOn();
        room.getCeiling().getCeiling();


    }
}
