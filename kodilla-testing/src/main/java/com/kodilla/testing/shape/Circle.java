package com.kodilla.testing.shape;

import java.lang.*;

class Circle implements Shape {

    double r;
    String name = "circle";
    double field = r * r * Math.PI;

    public Circle(double r) {
        this.r = r;
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

