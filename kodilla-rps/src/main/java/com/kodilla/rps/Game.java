package com.kodilla.rps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    private int rounds;

    public Game(int rounds) {
        this.rounds = rounds;
    }

    public int getRounds() {
        return rounds;
    }

    public int restartRounds(){
        rounds = 0;
        return rounds;
    }
    public int subtractRound(){
        return rounds--;
    }
    public int addRounds() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many rounds do you want to play");
        rounds = Integer.parseInt(br.readLine());
        return rounds;
    }

}
