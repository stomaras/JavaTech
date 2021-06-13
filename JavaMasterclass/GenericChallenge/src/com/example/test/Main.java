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
        FootballPlayer christiano = new FootballPlayer("Christiano Ronaldo");
        FootballPlayer ramos = new FootballPlayer("Sergio Ramos");
        Team<FootballPlayer> real = new Team<FootballPlayer>("Real Madrid");
        real.addPlayer(christiano);
        real.addPlayer(ramos);

        FootballPlayer messi = new FootballPlayer("Lionel Messi");
        FootballPlayer neymar = new FootballPlayer("Neymar JR");
        Team<FootballPlayer> barcelona = new Team<FootballPlayer>("Barcelona");
        barcelona.addPlayer(messi);
        barcelona.addPlayer(neymar);

        barcelona.matchResults(real, 5, 2);
        real.matchResults(barcelona, 4, 2);
        System.out.println(barcelona.getName() + " victories are: " + barcelona.getVictories());
        System.out.println(barcelona.getName() + " Ranking is: " + barcelona.ranking());
        System.out.println(real.getName() + " victories are: " + real.getVictories());
        System.out.println(real.getName() + " Ranking is: " + real.getVictories());



    }
}
