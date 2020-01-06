package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    private ArrayList<Shape> figure = new ArrayList<>();

    public ArrayList<Shape> getFigure(){
        return figure;
    }

    void addFigure(Shape shape){
        figure.add(shape);
    }
    void removeFigure(Shape shape){
        figure.remove(shape);
    }
    void getFigure(int n){
        figure.get(n);
    }
    void showFigures(){
        System.out.println(figure.toString());
    }
}
