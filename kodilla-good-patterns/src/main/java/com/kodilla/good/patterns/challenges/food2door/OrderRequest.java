package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {
    private User user;
    private Producer producer;

    public OrderRequest(final User user, final Producer producer){
        this.user = user;
        this.producer = producer;
    }
    public User getUser(){
        return user;
    }
    public Producer getGame(){
        return producer;
    }
}
