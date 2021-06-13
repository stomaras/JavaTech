package com.example.test;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int victories = 0;
    private int defeats = 0;
    private int draws = 0;
    private int played = 0;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getVictories() {
        return victories;
    }

    public int getDefeats() {
        return defeats;
    }

    public int getDraws() {
        return draws;
    }

    public int getPlayed() {
        return played;
    }

    public ArrayList<T> getMembers() {
        return members;
    }

    public boolean addPlayer(T player){
        if (members.contains(player) == false){
            members.add(player);
            System.out.println("New player added successfully");
            return true;
        } else {
            System.out.println(player.getName() + " already exists !");
            return false;
        }
    }

    public int numOfPlayers(ArrayList<T> members) {
        return members.size();
    }

    public int ranking(){
        return (victories * 2) + draws;
    }

    public void matchResults(Team<T> opponent, int ourScore, int theirScore) {
        String message = null;

        if (ourScore > theirScore) {
            victories++;
            message = " team wins ";
        } else if (ourScore == theirScore) {
            draws++;
            message = " team draw ";
        } else if (ourScore < theirScore){
            defeats++;
            message = " team lose from ";
        }
        played++;

        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            matchResults(null, theirScore, ourScore);
        }

    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()){
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
