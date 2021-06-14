package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store a list
        // of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail tp compile
        // if an attempt is made to add an incompatible team.

        // Your class should have a method to print out the teams in order.
        // And the team at the top of the league should be printed first.
        //

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> Barcelona = new Team<>("Barcelona");
        Team<FootballPlayer> RealMadrid = new Team<>("Real Madrid");
        Team<FootballPlayer> Juventus = new Team<>("Juventus");

        Team<BasketballPlayer> Panathinaikos = new Team<>("Panathinaikos");

        footballLeague.add(Barcelona);
        footballLeague.add(RealMadrid);
        footballLeague.add(Juventus);
        
        footballLeague.showLeagueTable();




    }
}
