package com.example.test;

import java.time.chrono.ThaiBuddhistEra;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckam = new SoccerPlayer("Beckam");

        Team<FootballPlayer> pao = new Team("Pao");
        pao.addPlayer(joe);
//        pao.addPlayer(pat);
//        pao.addPlayer(beckam);

        System.out.println(pao.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        //This won;t work because we added bound in Team class
        //Team<String> brokenTeam = new Team<String>("this won't work");
    }
}
