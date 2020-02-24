package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFlight {

    AllFlights allFlights = new AllFlights();
    public void allFlightsFrom(){
        allFlights.getFlights().stream()
                .filter(a->a.getDepartures().equals("Krakow"))
                .forEach(System.out::println);
    }
    public void allFlightsTo(){
        allFlights.getFlights().stream()
                .filter(a->a.getArrivals().equals("Poznan"))
                .forEach(System.out::println);
    }
    public void allFlightsViaTo(){

        Stream<Flights> streamDepartures = allFlights.getFlights().stream();
        streamDepartures.filter((a) -> a.getDepartures().equals("Krakow"))
                .collect(Collectors.toList());

        Stream<Flights> streamArrival = allFlights.getFlights().stream();
        streamArrival.filter(a->a.getArrivals().equals("Szczecin"))
                .map(a->streamDepartures.filter(b->b.getArrivals().equals(a.getDepartures())).findAny())
                .collect(Collectors.toList());
    }
}
