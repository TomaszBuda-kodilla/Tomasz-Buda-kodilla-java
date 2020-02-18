package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Shop{

    public OrderRequest process() {
        User user3 = new User("Jan","Kowlaski");
        Producer producer3 = new Producer("HealthyShop",7,"Goat Milk");
        return new OrderRequest(user3,producer3);
    }
}
