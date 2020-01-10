package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    private ArrayList<Shape> figure = new ArrayList<>();

    public ArrayList<Shape> getFigure() {
        return figure;
    }

    void addFigure(Shape shape) {
        figure.add(shape);
    }

    void removeFigure(Shape shape) {
        figure.remove(shape);
    }

    Shape getFigure(int n) {
        int range = figure.size();
        if (n >= 0 && n < range) {
            return figure.get(n);
        } else {
            return null;
        }
    }



    void showFigures() {
        System.out.println(figure.toString());
    }

    @Override
    public String toString(){
        return "Figure: " + figure + "\n";
    }

}
