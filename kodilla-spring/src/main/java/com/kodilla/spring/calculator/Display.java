package com.kodilla.spring.calculator;

import org.springframework.stereotype.Repository;

@Repository
public class Display {
    private double val,a,b;
    public void displayValue(double val){
        System.out.println("The calculation is: " + val);
    }
    public double add(double a,double b)
    {
        val = a+b;
        displayValue(val);
        return  val;
    }
    public double sub(double a, double b){
        val = a-b;
        displayValue(val);
        return val;
    }
    public double mul(double a, double b){
        val = a*b;
        displayValue(val);
        return val;
    }
    public double div(double a, double b){
        val = a/b;
        displayValue(val);
        return val;
    }
}
