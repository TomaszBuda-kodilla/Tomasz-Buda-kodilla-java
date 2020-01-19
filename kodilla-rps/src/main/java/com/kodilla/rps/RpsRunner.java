package com.kodilla.rps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RpsRunner {
    public static void main(String[] args ) throws IOException {
        System.out.println("Choose your nickname.");
        Random random = new Random();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myNick = br.readLine();

        User user = new User(myNick,0);

        Enemy enemy = new Enemy("Terminator",0);
        System.out.println("Your opponent will be ... " + enemy.enemyNick);

        boolean end = false;
        while (!end){
            System.out.println("Press  1-Scissors  |  2-Paper  |  3-Rock  ");
            String move = br.readLine();
            String enemyMove = Integer.toString(random.nextInt(3)+1);
            if(move.equals(enemyMove)){
                enemy.enemyScore++;
                user.myScore++;
            } else if (move.equals("1") && enemyMove.equals("2")){
                user.myScore++;
            } else if(move.equals("2") && enemyMove.equals("3")){
                user.myScore++;
            } else if(move.equals("3") && enemyMove.equals("1")){
                user.myScore++;
            } else {
                enemy.enemyScore++;
            }
            System.out.println("My Score " + user.myScore);
            System.out.println("Enemy Score " + enemy.enemyScore);
            if (user.myScore == 10 || enemy.enemyScore == 10){end = true;}

        }
    }
}
