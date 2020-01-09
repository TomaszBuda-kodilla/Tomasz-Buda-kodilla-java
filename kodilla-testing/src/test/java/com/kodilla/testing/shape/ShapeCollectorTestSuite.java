package com.kodilla.testing.shape;

import com.kodilla.testing.shape.*;
import org.junit.*;
import java.util.*;

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
        ShapeCollector newFigure = new ShapeCollector();

        //When
        ShapeCollector.addFigure(new Square(25));

        //Then
        Assert.assertEquals(1,newFigure.getFigure().size());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector newFigure = new ShapeCollector();
        ShapeCollector.addFigure(new Square(25));

        //When
        boolean result = newFigure.removeFigure(new Square(25));

        //Then
        Assert.assertEquals(0,newFigure.getFigure().size());
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector newFigure = new ShapeCollector();
        Shape square = new Square();
        newFigure.addFigure(square);

        //When
        Shape temporary = newFigure.getFigure(0);

        //Then
        Assert.assertEquals(square,temporary);
    }
    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector newFigure = new ShapeCollector();
        Shape square = new Square(25);
        newFigure.addFigure(square);

        ArrayList<Shape> myList = new ArrayList<>();
        myList.add(square);
        myList.add(square);
        myList.add(square);
        //When

        ArrayList<Shape> myTemporaryList = newFigure.getFigure();
        //Then
        Assert.assertEquals(myList,myTemporaryList);
    }*/
}
