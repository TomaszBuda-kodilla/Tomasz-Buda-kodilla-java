package com.kodilla.testing.shape;

public class Triangle implements Shape {

    double a, h;
    String name = "triangle";
    double field = (a * h) / 2;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
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
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return name.equals(triangle.getShapeName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

}

