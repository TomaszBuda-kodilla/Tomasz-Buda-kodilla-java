package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.*;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> testOneList = new ArrayList<>();
        //When
        if (testOneList.size() == 0) {
            System.out.println("Testing ");
        }
        //Then
        Assert.assertTrue("test porprawny",true);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> testTwoList = new ArrayList<>();
        Random theGenerator = new Random();
        for (int i = 0; i < 50; i++) {
            testTwoList.add(theGenerator.nextInt(101));
        }
        OddNumbersExterminator test = new OddNumbersExterminator();
        test.exterminate(testTwoList);
    }
}

