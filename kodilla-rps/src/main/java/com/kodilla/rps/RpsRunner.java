package com.kodilla.rps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RpsRunner {
    public static void main(String[] args) {

       /* System.out.println("Choose your nickname.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myNick = br.readLine();

        Game game = new Game(0);
        User user = new User(myNick, 0);
        Enemy enemy = new Enemy("Terminator", 0);

        System.out.println("Your opponent will be ... " + enemy.getEnemyNick());

        do {
            System.out.println("How many rounds do you want to play");
            int round = game.getRounds();
            boolean end = false;

            while (!end) {

                System.out.println("Press  1-Scissors  |  2-Paper  |  3-Rock  |\n  x-End of the game  |  n-Restart the game");
                String move = br.readLine();

                if (move.equals(enemy.getEnemyMove())) {
                    enemy.addEnemyScore();
                    user.addMyScore();
                    System.out.println("Enemy choose " + enemy.getEnemyMove() + "\n");
                } else if (move.equals("1") && enemy.getEnemyMove().equals("2")) {
                    user.addMyScore();
                    System.out.println("Enemy choose " + enemy.getEnemyMove() + "\n");
                } else if (move.equals("2") && enemy.getEnemyMove().equals("3")) {
                    user.addMyScore();
                    System.out.println("Enemy choose " + enemy.getEnemyMove() + "\n");
                } else if (move.equals("3") && enemy.getEnemyMove().equals("1")) {
                    user.addMyScore();
                    System.out.println("Enemy choose " + enemy.getEnemyMove() + "\n");
                } else if (move.equals("x")) {
                    System.out.println("Do you really want to exit the game ? \n Press y-Yes or N-no");
                    String decision = br.readLine();
                    if (decision.equals("y")) {
                        System.exit(0);
                    } else {
                        round++;
                    }
                } else if (move.equals("n")) {
                    System.out.println("Do you really want to restart the game ? \n Press y-Yes or N-no");
                    String decision = br.readLine();
                    if (decision.equals("y")) {
                        game.restartRounds();
                        break;
                    } else if(decision.equals("n")) {
                        break;
                    }
                } else {
                    enemy.addEnemyScore();
                }
                System.out.println("My Score " + user.getMyScore());
                System.out.println("Enemy Score " + enemy.getEnemyScore());
                round--;
                if (round == 0) {
                    end = true;
                    if (user.getMyScore() > enemy.getEnemyScore()) {
                        System.out.println("!!! Congratulations you are the winner !!! ");
                        break;
                    } else if (user.getMyScore() < enemy.getEnemyScore()) {
                        System.out.println("The winner is a " + enemy.getEnemyNick());
                        break;
                    } else {
                        System.out.println("It is a draw.");
                        break;
                    }
                }break;
            }
        }while(br.readLine() != "n");
        System.exit(0);
    */}
}
