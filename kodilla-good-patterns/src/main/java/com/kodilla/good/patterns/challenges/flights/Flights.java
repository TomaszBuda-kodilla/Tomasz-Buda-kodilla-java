package com.kodilla.good.patterns.challenges.flights;

public class Flights {
    private final String departures;
    private final String arrivals;

    public Flights(String departures,String arrivals){
        this.arrivals = arrivals;
        this.departures = departures;
    }

    public String getDepartures(String from) {
        return departures;
    }

    public String getArrivals(String to) {
        return arrivals;
    }

    @Override
    public String toString(){
        return ("The departure airport - " + getDepartures(departures) + " |  The arrival airport - "+ getArrivals(arrivals));
    }
}
