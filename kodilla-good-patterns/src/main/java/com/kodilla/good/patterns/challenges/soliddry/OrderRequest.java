package com.kodilla.good.patterns.challenges.soliddry;

public class OrderRequest {
    private User user;
    private Games game;

    public OrderRequest(final User user,final Games game){
        this.user = user;
        this.game = game;
    }
    public User getUser(){
        return user;
    }
    public Games getGame(){
        return game;
    }
}
