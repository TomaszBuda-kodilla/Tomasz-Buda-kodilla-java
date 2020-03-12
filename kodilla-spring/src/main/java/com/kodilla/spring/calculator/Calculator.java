package com.kodilla.spring.calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
    private final Display display;
    double a,b,val;

    public Calculator(final Display display) {
        this.display = display;
    }

    public double addNumbers (){
        return display.add(5,5);
    }
    public double subNumbers(){
        return display.sub(5,5);
    }
    public double mulNumbers(){
        return display.mul(5,5);
    }
    public double divNumbers() {
        return display.div(5, 5);
    }
}
