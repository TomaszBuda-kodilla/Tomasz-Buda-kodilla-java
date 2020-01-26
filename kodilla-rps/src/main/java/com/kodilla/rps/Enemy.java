package com.kodilla.rps;

import java.util.Random;

public class Enemy {

    private String enemyNick;
    private int enemyScore;
    private String enemyMove;

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

    public int addEnemyScore() {
        return enemyScore++;
    }

    public int restartEnemyScore() {
        return enemyScore = 0;
    }

    public String getEnemyMove(){
        Random random = new Random();
        enemyMove = Integer.toString(random.nextInt(3) + 1);
        return enemyMove;
    }

}

