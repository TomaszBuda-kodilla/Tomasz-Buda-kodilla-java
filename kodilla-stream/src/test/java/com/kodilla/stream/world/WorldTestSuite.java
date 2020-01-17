package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        //Given
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country(new BigDecimal(1000000000), "Poland"));

        Continent africa = new Continent("Africa");
        africa.addCountry(new Country(new BigDecimal(1000000000), "Egypt"));

        Continent asia = new Continent("Asia");
        asia.addCountry(new Country(new BigDecimal(1000000000), "China"));

        Continent america = new Continent("America");
        america.addCountry(new Country(new BigDecimal(1000000000), "Mexico"));

        World world = new World();
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);
        world.addContinent(america);

        //When

        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("4000000000");
        Assert.assertEquals(expectedPeopleQuantity, totalPeopleQuantity );
    }
}
