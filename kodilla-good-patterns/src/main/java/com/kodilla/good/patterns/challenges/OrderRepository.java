package com.kodilla.good.patterns.challenges;

public class OrderRepository {
    boolean createOrder(User user, Games game){
        String totalPrice = String.format("%.2f",game.getPrice()*game.getPieces());
        System.out.println("Your order is: " + game.getProduct()+ " - " + game.getPieces() + " pcs. total price is " + totalPrice + "$" );
        return true;
    }
}
