package com.kodilla.exception.test;

import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(0,2);
        } catch (Exception e) {
            System.out.println("Wrong value of the variable");
        } finally {
            System.out.println("I am still here.");
        }
    }
}
