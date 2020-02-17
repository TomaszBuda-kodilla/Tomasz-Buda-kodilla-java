package com.kodilla.good.patterns.challenges.soliddry;

public class User {
    String name;
    String surname;

    public User(User user) {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
