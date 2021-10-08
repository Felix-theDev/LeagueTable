package com.company;

public class Arsenal extends Team {
    @Override
    void result(Team team, int theirScore, int ourScore) {

    }

    public Arsenal(String name) {
        super(name);
    }

    @Override
    public int points() {
        return 0;
    }
}
