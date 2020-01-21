package com.kodilla.rps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RpsRunner {
    public static void main(String[] args) throws IOException {

        System.out.println("Choose your nickname.");
        Random random = new Random();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myNick = br.readLine();

        User user = new User(myNick, 0);

        Enemy enemy = new Enemy("Terminator", 0);
        System.out.println("Your opponent will be ... " + enemy.getEnemyNick());

        do {
            System.out.println("How many rounds do you want to play");
            int rounds = Integer.parseInt(br.readLine());
            boolean end = false;


            while (!end) {

                System.out.println("Press  1-Scissors  |  2-Paper  |  3-Rock  |\n  x-End of the game  |  n-Restart the game");
                String move = br.readLine();
                String enemyMove = Integer.toString(random.nextInt(3) + 1);
                if (move.equals(enemyMove)) {
                    enemy.addEnemyScore();
                    user.addMyScore();
                    System.out.println("Enemy choose " + enemyMove + "\n");
                } else if (move.equals("1") && enemyMove.equals("2")) {
                    user.addMyScore();
                    System.out.println("Enemy choose " + enemyMove + "\n");
                } else if (move.equals("2") && enemyMove.equals("3")) {
                    user.addMyScore();
                    System.out.println("Enemy choose " + enemyMove + "\n");
                } else if (move.equals("3") && enemyMove.equals("1")) {
                    user.addMyScore();
                    System.out.println("Enemy choose " + enemyMove + "\n");
                } else if (move.equals("x")) {
                    System.out.println("Do you really want to exit the game ? \n Press y-Yes or N-no");
                    String decision = br.readLine();
                    if (decision.equals("y")) {
                        end = true;
                        System.exit(0);
                    } else {
                        rounds++;
                    }
                } else if (move.equals("n")) {
                    System.out.println("Do you really want to restart the game ? \n Press y-Yes or N-no");
                    String decision = br.readLine();
                    if (decision.equals("n")) {
                        rounds ++;
                    } else {
                        break;
                    }

                } else {
                    enemy.addEnemyScore();
                }
                System.out.println("My Score " + user.getMyScore());
                System.out.println("Enemy Score " + enemy.getEnemyScore());
                if (rounds == 1) {
                    end = true;
                    if (user.getMyScore() > enemy.getEnemyScore()) {
                        System.out.println("!!! Congratulations you are the winner !!! ");
                    } else if (user.getMyScore() < enemy.getEnemyScore()) {
                        System.out.println("The winner is a " + enemy.getEnemyNick());
                    } else {
                        System.out.println("It is a draw.");
                    }

                }
                rounds--;

            }
        }while(br.readLine() != "n");
        System.exit(0);
    }
}
