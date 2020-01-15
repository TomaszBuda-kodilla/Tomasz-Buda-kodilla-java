package com.kodilla.exception.test;

public class ThirdChallenge {
    public static void main(String[] args){
        Flight flight = new Flight("Krakow","Warsaw");
        FindFlight flightFind = new FindFlight();
        try{
            flightFind.findFlight(flight);
        } catch (RouteNotFoundException e){
            System.out.println("can not reach this destination.");
        } finally {
            System.out.println("I will be here for eternity.");
        }
    }
}
