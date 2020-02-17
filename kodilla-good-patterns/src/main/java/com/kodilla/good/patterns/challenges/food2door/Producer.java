package com.kodilla.good.patterns.challenges.food2door;

public class Producer {
    private String producerName;
    private int pieces;
    private String typeOfProduct;

    public Producer(final String producerName, final int pieces, final String typeOfProduct) {
        this.producerName = producerName;
        this.pieces = pieces;
        this.typeOfProduct = typeOfProduct;
    }

    public String getProducerName() {
        return producerName;
    }

    public int getPieces() {
        return pieces;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public void order() {
        System.out.println("Producer: " + getProducerName() + " - " + getPieces() + " of " + getTypeOfProduct());
    }
}
