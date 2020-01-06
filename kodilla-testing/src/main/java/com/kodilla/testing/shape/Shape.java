package com.kodilla.testing.shape;

import java.util.*;

public interface Shape {
    String getShapeName();
    int getField();
}

class Circle implements Shape{
    public String getShapeName()
    {
        System.out.println("This is Circle");
        return ("");
    }
    public int getField()
    {
        int radius = 5;
        int result;
        result = (3 * (radius*radius));
        return result;
    }
}

class Triangle implements Shape{
    public String getShapeName()
    {
        System.out.println("This is Triangle");
        return ("");
    }
    public int getField()
    {
        int a = 2, height = 4;
        int result;
        result = (a*height)/2;
        return result;
    }
}

class Square implements Shape{
    public String getShapeName()
    {
        System.out.println("This is Square");
        return ("");
    }
    public int getField()
    {
        int a = 5;
        int result;
        result = a*a;
        return result;
    }
}


