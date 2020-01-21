package com.kodilla.rps;

public class User {
    private String nick;
    private int myScore;

    public User(String nick, int myScore) {
        this.nick = nick;
        this.myScore = myScore;
    }

    public String getNick() {
        return nick;
    }

    public int getMyScore() {
        return myScore;
    }

    public int addMyScore(){
        return myScore++;
    }
    public int restartMyScore(){
        return myScore=0;
    }
}
