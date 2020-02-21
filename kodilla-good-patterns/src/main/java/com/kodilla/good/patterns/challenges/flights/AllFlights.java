package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class AllFlights {
    private final List<Flights> theFlightsList = new ArrayList<>();

    public AllFlights(){
        theFlightsList.add(new Flights("Krakow","Warszawa"));
        theFlightsList.add(new Flights("Krakow","Poznan"));
        theFlightsList.add(new Flights("Krakow","Gdansk"));
        theFlightsList.add(new Flights("Gdansk","Szczecin"));
    }
    public List<Flights> getFlights(){
        return new ArrayList<>(theFlightsList);
    }
}
