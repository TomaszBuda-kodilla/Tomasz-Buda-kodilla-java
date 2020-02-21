package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Test positive. ");
        //Then
        Assert.assertEquals("", lastLog);
    }

    @Test
    public void testLog() {
        Logger.getInstance().log("");
    }
}
