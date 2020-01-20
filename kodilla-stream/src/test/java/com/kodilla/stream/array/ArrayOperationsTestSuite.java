package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] listOfNumbers = new int[] {7,6,5,12,11,13,24,5,8,9,11,20,13,15,25,18,20,11,15,12};
        //When
        double myAverage = ArrayOperations.getAverage(listOfNumbers);
        //Then
        Assert.assertEquals(13,myAverage,0.1);
    }
}
