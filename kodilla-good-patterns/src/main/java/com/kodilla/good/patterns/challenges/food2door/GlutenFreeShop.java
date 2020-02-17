package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop {
    public OrderRequest order(){
        User user = new User("Adam","Nowak");
        Producer producer = new Producer("GlutenFreeShop",40,"Eggs");
        return new OrderRequest(user,producer);
    }
}
