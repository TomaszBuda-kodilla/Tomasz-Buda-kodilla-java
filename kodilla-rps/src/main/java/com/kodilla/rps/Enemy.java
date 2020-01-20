package com.kodilla.rps;

public class Enemy {

    private String enemyNick;
    private int enemyScore;

    public Enemy(String enemyNick, int enemyScore) {
        this.enemyNick = enemyNick;
        this.enemyScore = enemyScore;
    }

    public String getNick() {
        return enemyNick;
    }

    public int getMyScore() {
        return enemyScore;
    }
}

