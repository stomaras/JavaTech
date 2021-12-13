package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Encapsulation is the mechanism that allows you to restrict access to certain components in the objects
        // that you are creating. So you are able to protect the members of a class from external access
        // So, it can be very useful to hide that inner working from another class to sort of give you more control
        // and to be able to enable you to change things without breaking code elsewhere.

        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
