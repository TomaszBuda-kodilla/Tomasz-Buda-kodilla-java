package com.kodilla.good.patterns.challenges;

public class Games {
    private String product;
    private int pieces;
    private double price;

    public Games(final String product,final int pieces,final double price) {
        this.product = product;
        this.pieces = pieces;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public int getPieces() {
        return pieces;
    }

    public double getPrice() {
        return price;
    }

    public void order() {
        double totalCost=getPieces()*getPrice();
        System.out.println("Product: " + getProduct() + " - " + getPieces() + " for " + getPrice() + ". Total price: " + totalCost + "$");
    }
}
