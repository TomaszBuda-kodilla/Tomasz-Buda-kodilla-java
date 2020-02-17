package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.soliddry.*;

public class MainChallengesTwo {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.order();

        ProductOrderService productOrderService = new ProductOrderService(new InformationService(), new OrderService(), new OrderRepository());
        productOrderService.process(orderRequest);
    }
}
