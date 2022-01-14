package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        I will use a simple seat booking system in theater
        First we have a Theater class and then we are gonna create
        an inner Seat class
         */
        Theatre theatre = new Theatre("Olympian", 8, 12);
        theatre.getSeats();
    }
}
