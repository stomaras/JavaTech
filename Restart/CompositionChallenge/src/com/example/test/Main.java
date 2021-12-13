package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in ths video.
        Ceiling ceiling = new Ceiling("OneLight","red",1);
        Lamp lamp = new Lamp("EuroLamp","green",2);
        Bed bed = new Bed("rock",2,1,"double bed", "black");
        Room room1 = new Room("Bedroom",new Wall(2,3),new Wall(2,3),new Wall(3,3),new Wall(3,3),ceiling,bed,lamp);

        System.out.println("New room consists of 4 walls with chars: "+ room1.getWall1().toString()+"\n" +
                "One bed: " + room1.getBed().toString());
    }
}
