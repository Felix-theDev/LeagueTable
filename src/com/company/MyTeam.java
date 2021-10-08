package com.company;

import java.util.ArrayList;

public class MyTeam <T extends Team> implements Comparable<Team> {
    int played = 0;
    int win = 0;
    int draw = 0;
    int lost = 0;
    int gd = 0;
    int gs = 0;
    int ga = 0;

    private ArrayList<Team> members = new ArrayList<>();
    public void result(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            System.out.println("We won " + ourScore + "- " + theirScore);
            win++;

        } else if (theirScore > ourScore) {
            System.out.println("We lost " + ourScore + "- " + theirScore);
            played++;
            lost++;

        }
        else{
            played++;
            draw++;

        }
        played++;
        if(opponent != null){
            opponent.result(null, theirScore, ourScore);
        }

    }
    public boolean addTeam(Team team){
        if(members.contains(team)){
            System.out.println(team.name +" is already in the league");
            return false;
        }
        else{
            members.add(team);
            System.out.println((team.name + " has been added"));
            return true;
        }

    }
    public int points(){
        int point = (win * 3) + draw;
        return point;
    }

    @Override
    public int compareTo(Team team) {
        if(this.points() > team.points()){
           return 1;
        }
        else if(team.points() > this.points()){
            return -1;
        }
        else return 0;
    }
}
