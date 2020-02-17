package com.kodilla.good.patterns.challenges.food2door;

public class ServiceInformation {
    public void inform(User user, Producer producer){
        System.out.println("Hello " + user.getName() + " " + user.getSurname());
    }
}
