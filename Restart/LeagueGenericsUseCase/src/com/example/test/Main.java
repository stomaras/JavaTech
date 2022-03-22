package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BasketballPlayer kobe = new BasketballPlayer("Kobe Bryant");
        BasketballPlayer paul = new BasketballPlayer("Paul Gasol");

        BasketballPlayer garnet = new BasketballPlayer("Garnet");
        BasketballPlayer pierce = new BasketballPlayer("Paul Pierce");

        BasketballPlayer lebron = new BasketballPlayer("Lebron James");
        BasketballPlayer wade = new BasketballPlayer("Dyane Wade");



        Team<BasketballPlayer> lakers = new Team<>("Los Angeles Lakers");
        Team<BasketballPlayer> miami = new Team<>("Miami Heat");
        Team<BasketballPlayer> celtics = new Team<>("Boston Celtics");

        lakers.addPlayer(kobe);
        lakers.addPlayer(paul);

        lakers.matchResult(miami, 4, 2);
        lakers.matchResult(celtics, 4, 3);
        celtics.matchResult(miami, 4, 3);

        System.out.println(lakers.compareTo(celtics));
        System.out.println(lakers.compareTo(miami));
        System.out.println(miami.compareTo(celtics));

        League<Team<BasketballPlayer>> basketLeague = new League<>("NBA");
        basketLeague.addTeam(lakers);
        basketLeague.addTeam(celtics);
        basketLeague.addTeam(miami);

        basketLeague.printTeams();




    }
}
