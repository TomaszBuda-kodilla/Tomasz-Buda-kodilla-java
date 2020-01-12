package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public interface Temperatures {

    //Integer is a key - first element of the map is an identifier of weather station
    //Double is a value - second element of the map is a temperature in Celsius degrees

    HashMap<Integer, Double> getTemperatures();
}
