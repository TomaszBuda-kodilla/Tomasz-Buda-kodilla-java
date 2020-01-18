package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] listOfNumbers = new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        //When
        double myAverage = ArrayOperations.getAverage(listOfNumbers);
        //Then
        Assert.assertEquals(1,myAverage,0.1);
    }
}
