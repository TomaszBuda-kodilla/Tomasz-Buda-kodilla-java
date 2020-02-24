package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Lettuce")
                .ingredient("Onion")
                .ingredient("Bacon")
                .ingredient("Chili")
                .ingredient("Cucumber")
                .ingredient("Mushrooms")
                .ingredient("Shrimps")
                .ingredient("Cheese")
                .bun("bun with sesame")
                .sauce("standard")
                .build();
        System.out.println(bigmac);
        //Then
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(8,howManyIngredients);
    }
}
