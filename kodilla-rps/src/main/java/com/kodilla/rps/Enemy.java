package com.kodilla.rps;

public class Enemy {

    private String enemyNick;
    private int enemyScore;

    public Enemy(String enemyNick, int enemyScore) {
        this.enemyNick = enemyNick;
        this.enemyScore = enemyScore;
    }

    public String getEnemyNick() {
        return enemyNick;
    }

    public int getEnemyScore() {
        return enemyScore;
    }

    public int addEnemyScore(){
        return enemyScore++;
    }
    public int restartEnemyScore(){
        return enemyScore=0;
    }
}

