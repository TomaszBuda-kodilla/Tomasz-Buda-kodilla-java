package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    public void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> availableFlights = new HashMap<>();

        availableFlights.put("Krakow", true);
        availableFlights.put("Warsaw", true);
        int counter=0;
        for (Map.Entry<String,Boolean> entry : availableFlights.entrySet()) {
            counter += 1;
            if (flight.getArrivalAirport() == entry.getKey()) {
                System.out.println("Flight nr. 000" + counter + " is available.");
            } else {
                System.out.print("Flight nr. 000" + counter + " ");
                throw new RouteNotFoundException();
            }
        }
    }
}

