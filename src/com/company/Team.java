package com.company;

public abstract class Team {
    String name;
    int points;

    public Team(String name) {
        this.name = name;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

   abstract void result(Team team, int theirScore, int ourScore);

    public abstract int points();
}
