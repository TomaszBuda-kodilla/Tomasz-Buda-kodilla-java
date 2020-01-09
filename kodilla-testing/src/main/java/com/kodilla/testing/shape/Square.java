package com.kodilla.testing.shape;

public class Square implements Shape {

    double a;
    String name = "square";
    double field = a * a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return field;
    }

}
