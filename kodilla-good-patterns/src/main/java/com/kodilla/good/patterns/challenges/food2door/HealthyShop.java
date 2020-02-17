package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop {
    public OrderRequest order(){
        User user = new User("Jan","Kowlaski");
        Producer producer = new Producer("HealthyShop",7,"Goat Milk");
        return new OrderRequest(user,producer);
    }
}
