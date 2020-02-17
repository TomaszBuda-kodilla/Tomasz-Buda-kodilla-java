package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop {
    public OrderRequest order(){
        User user = new User("Tomasz","Buda");
        Producer producer = new Producer("ExtraFoodShop",10,"Yogurt");
        return new OrderRequest(user,producer);
    }
}
