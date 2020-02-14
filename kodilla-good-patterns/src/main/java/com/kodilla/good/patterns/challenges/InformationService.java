package com.kodilla.good.patterns.challenges;

public class InformationService {
    public void inform(User user, Games game){
        System.out.println("Hello " + user.getName() + " " + user.getSurname());
    }
}
