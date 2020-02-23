package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last log is: " + lastLog);
        //Then
        Assert.assertEquals("My first log.", lastLog);
    }

    @Test
    public void testLog() {
        Logger.getInstance().log("My first log.");
    }
}
