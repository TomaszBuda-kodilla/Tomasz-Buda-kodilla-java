package com.kodilla.patterns2.facade;

public class Item {
    private final Long productId;
    private final double gty;

    public Item(Long productId, double gty) {
        this.gty = gty;
        this.productId = productId;
    }

    public Long getProductId() {
        return productId;
    }

    public double getGty() {
        return gty;
    }
}
