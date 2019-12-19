package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator simpleCalculator = new Calculator(10,10);

        int firstNumber = simpleCalculator.getA();
        int secondNumber = simpleCalculator.getB();
//TEST 1
        if (firstNumber == 10 && secondNumber == 10 )
        {
            System.out.println(simpleCalculator.add(firstNumber,secondNumber) + " test OK");
        }
        else
        {
            System.out.println("Error!");
        }
//TEST 2
        if (firstNumber == 10 && secondNumber == 10 )
        {
            System.out.println(simpleCalculator.subtract(firstNumber,secondNumber) + " test OK");
        }
        else
        {
            System.out.println("Error!");
        }

    }
}