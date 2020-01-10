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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return name.equals(circle.getShapeName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}


