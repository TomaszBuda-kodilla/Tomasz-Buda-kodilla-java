package com.kodilla.testing.shape;

import com.kodilla.testing.shape.*;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
  /*  @Test
    public void testAddFigure() {
        //Given
        ShapeCollector newFigure = new ShapeCollector("Circle");

        //When
        ShapeCollector.addFigure("This is Tringle",15);

        //Then
        Assert.assertEquals(1, );
    }*/
}
