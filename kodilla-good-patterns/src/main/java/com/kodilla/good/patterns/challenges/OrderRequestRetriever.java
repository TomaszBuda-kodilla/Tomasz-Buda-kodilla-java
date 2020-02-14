package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest order()
    {
        User user = new User("Tomasz","Buda");
        Games game = new Games("Witcher",1,199.00);
        return new OrderRequest(user,game);
    }
}
