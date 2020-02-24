package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.flights.AllFlights;
import com.kodilla.good.patterns.challenges.flights.FindFlight;
import com.kodilla.good.patterns.challenges.flights.Flights;

public class MainChallengesFlights {
    public static void main(String[] args){
        FindFlight findFlight = new FindFlight();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>> ALL FLIGHTS FROM <<<<<<<<<<<<<<<<<<<<<<<<\n");
        findFlight.allFlightsFrom("Krakow");
        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> ALL FLIGHTS TO <<<<<<<<<<<<<<<<<<<<<<<<<\n");
        findFlight.allFlightsTo("Szczecin");
        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>> ALL FLIGHTS TO VIA <<<<<<<<<<<<<<<<<<<<<<<\n");
        findFlight.allFlightsViaTo("Krakow","Szczecin");
    }
}
