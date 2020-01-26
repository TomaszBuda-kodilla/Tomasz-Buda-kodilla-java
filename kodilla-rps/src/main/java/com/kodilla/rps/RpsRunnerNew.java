package com.kodilla.rps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RpsRunnerNew {
    public static void main(String[] args) throws IOException {

        System.out.println("Choose your nickname.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myNick = br.readLine();

        Game game = new Game(0);
        User user = new User(myNick, 0);
        Enemy enemy = new Enemy("Terminator", 0);

        System.out.println("Your opponent will be ... " + enemy.getEnemyNick());
        boolean end = false;
        while (!end) {
            user.restartMyScore();
            enemy.restartEnemyScore();
            game.addRounds();
            do {
                System.out.println("Press  1-Scissors  |  2-Paper  |  3-Rock  |\n  x-End of the game  |  n-Restart the game");
                String move = br.readLine();
                switch (move) {
                    case "x": {
                        System.out.println("Do you really want to exit the game ? \n Press y-Yes or n-No");
                        String decision = br.readLine();
                        if (decision.equals("n")) {
                            System.out.println("Welcome back to the game.");
                        } else if (decision.equals("y")) {
                            System.exit(0);
                        } else {
                            System.out.println("Wrong option");
                        }
                        break;
                    }
                    case "n": {
                        System.out.println("Do you really want to restart the game ? \n Press y-Yes or n-No");
                        String decision = br.readLine();
                        if (decision.equals("n")) {
                            System.out.println("Continue playing the game");
                        } else if (decision.equals("y")) {
                            game.restartRounds();
                        } else {
                            System.out.println("Wrong option");
                        }
                        break;
                    }
                    case "1": {
                        System.out.println("You picked Scissors");
                        game.subtractRound();
                        switch (enemy.getEnemyMove()) {
                            case "1":
                                System.out.println("Enemy choice is: Scissors");
                                user.addMyScore();
                                enemy.addEnemyScore();
                                break;
                            case "2":
                                System.out.println("Enemy choice is: Paper");
                                user.addMyScore();
                                break;
                            case "3":
                                System.out.println("Enemy choice is: Rock");
                                enemy.addEnemyScore();
                                break;
                        }
                        System.out.println("Score is: " + user.getMyScore() + " : " + enemy.getEnemyScore());
                        break;
                    }
                    case "2": {
                        System.out.println("You picked Paper");
                        game.subtractRound();
                        switch (enemy.getEnemyMove()) {
                            case "2":
                                System.out.println("Enemy choice is Paper");
                                enemy.addEnemyScore();
                                user.addMyScore();
                                break;
                            case "1":
                                System.out.println("Enemy choice is Scissors");
                                enemy.addEnemyScore();
                                break;
                            case "3":
                                System.out.println("Enemy choice is Rock");
                                user.addMyScore();
                                break;
                        }
                        System.out.println("Score is: " + user.getMyScore() + " : " + enemy.getEnemyScore());
                        break;
                    }
                    case "3": {
                        System.out.println("You picked Rock");
                        game.subtractRound();
                        switch (enemy.getEnemyMove()) {
                            case "3":
                                System.out.println("Enemy choice is: Rock");
                                user.addMyScore();
                                enemy.addEnemyScore();
                                break;
                            case "2":
                                System.out.println("Enemy choice is Paper ");
                                enemy.addEnemyScore();
                                break;
                            case "1":
                                System.out.println("Enemy choice is Scissors");
                                user.addMyScore();
                                break;
                        }
                        System.out.println("Score is user " + user.getMyScore() + " : " + enemy.getEnemyScore() + " enemy");
                        break;
                    }
                }
                if (game.getRounds() == 0) {
                    if (user.getMyScore() > enemy.getEnemyScore()) {
                        System.out.println("!!! Congratulations you are the winner !!! ");
                    } else if (user.getMyScore() < enemy.getEnemyScore()) {
                        System.out.println("The winner is a " + enemy.getEnemyNick());
                    } else {
                        System.out.println("It is a draw.");
                    }
                }
                System.out.println("Starting a new game.");
            } while (game.getRounds() != 0);
        }
    }
}
