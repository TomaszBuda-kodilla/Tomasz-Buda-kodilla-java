package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Shop{


    public OrderRequest process() {
        User user2 = new User("Adam","Nowak");
        Producer producer2 = new Producer("GlutenFreeShop",40,"Eggs");
        return new OrderRequest(user2,producer2);
    }
}
