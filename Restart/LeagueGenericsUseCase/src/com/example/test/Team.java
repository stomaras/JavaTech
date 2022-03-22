package com.example.test;

import java.util.ArrayList;

public class Team<T extends Player>  implements Comparable<Team<T>>{
    private String name;
    int won = 0;
    int lose = 0;
    int tied = 0;
    int played = 0;

    ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){
            return false;
        } else {
            members.add(player);
            return true;
        }
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){

        String message = "";

        if (ourScore > theirScore){
            won++;
            message = " beat the game ";
        } else if (ourScore == theirScore){
            tied++;
            message = "  tied the game ";
        } else {
            lose++;
            message = " lose the game ";
        }

        played++;
        if(opponent != null){
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won * 3) + (tied);
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()){
            return 1;
        } else if (this.ranking() < team.ranking()){
            return -1;
        } else {
            return 0;
        }
    }
}
