package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final BigDecimal peopleQuantity;
    private final String countryName;

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public Country(final BigDecimal peopleQuantity,final String countryName) {
        this.peopleQuantity = peopleQuantity;
        this.countryName = countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country that = (Country) o;
        return peopleQuantity.equals(that.peopleQuantity);
    }
}
