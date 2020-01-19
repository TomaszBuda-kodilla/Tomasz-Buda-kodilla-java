package com.kodilla.rps;

public class Enemy {

    String enemyNick;
    int enemyScore;

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

