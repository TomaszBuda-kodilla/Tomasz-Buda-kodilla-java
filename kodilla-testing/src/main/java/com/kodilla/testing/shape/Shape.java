package com.kodilla.testing.shape;

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
        return 10;
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
        return 15;
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
        return 5;
    }
}

