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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return name.equals(square.getShapeName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
