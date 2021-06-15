package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // What I will do is use a simple seatbooking system in theater to see how
        // these classes that we've used earlier fit into the Java Collections Framework.
        // So theater seats will be numbered with a row letter, and then a seat number within
        // each row.

        Theatre theatre = new Theatre("Olympian", 8, 12);
        theatre.getSeats();
        if (theatre.reserveSeat("H13")) {
            System.out.println("Please Pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
