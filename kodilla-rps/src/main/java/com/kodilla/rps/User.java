package com.kodilla.rps;

public class User {
    String nick;
    int myScore;

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
}
