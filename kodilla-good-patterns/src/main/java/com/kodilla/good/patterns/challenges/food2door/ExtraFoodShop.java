package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Shop{

    public OrderRequest process() {
        User user1 = new User("Tomasz","Buda");
        Producer producer1 = new Producer("ExtraFoodShop",10,"Yogurt");
        return new OrderRequest(user1,producer1);
    }
}
