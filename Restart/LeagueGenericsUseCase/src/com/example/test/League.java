package com.example.test;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team){
        if (teams.contains(team)){
            return false;
        } else {
            teams.add(team);
            return true;
        }
    }

    public void printTeams(){
        Collections.sort(teams);
        for (Team t : teams){
            System.out.println(t.getName() + " -> " + t.ranking() + " points");
        }
    }
}
