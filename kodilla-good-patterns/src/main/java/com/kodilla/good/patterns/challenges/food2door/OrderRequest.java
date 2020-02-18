package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {
    private User user;
    private Producer producer;

    public OrderRequest(User user, Producer producer) {
        this.user = user;
        this.producer = producer;
            }

    public User getUser() {
        return user;
    }

    public Producer getGame() {
        return producer;
    }

}
