package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFlight {

    AllFlights allFlights = new AllFlights();

    public void allFlightsFrom(String from) {
        allFlights.getFlights().stream()
                .filter(a -> "Krakow".equals(a.getDepartures(from)))
                .forEach(System.out::println);
    }

    public void allFlightsTo(String to) {
        allFlights.getFlights().stream()
                .filter(a -> a.getArrivals(to).equals("Poznan"))
                .forEach(System.out::println);
    }

    public void allFlightsViaTo(String from, String to) {
        List<Flights> flightsFromCracov = allFlights.getFlights().stream().filter((a) -> a.getDepartures(from).equals("Krakow"))
                .collect(Collectors.toList());

        allFlights.getFlights().stream()
                .filter(a -> a.getArrivals(to).equals("Szczecin"))
                .forEach(a -> {
                    Optional<Flights> flight = flightsFromCracov.stream()
                            .filter(b -> b.getArrivals(to).equals(a.getDepartures(from)))
                            .findAny();
                    if (flight.isPresent()) {
                        System.out.println(flight.get());
                        System.out.println(a);
                    }
                });
    }
}
