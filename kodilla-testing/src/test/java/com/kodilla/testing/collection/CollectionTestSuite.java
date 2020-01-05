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
        OddNumbersExterminator test1 = new OddNumbersExterminator();
        test1.exterminate(testOneList);
        Assert.assertEquals(testOneList.size(),0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> testTwoList = new ArrayList<>();
        Random theGenerator = new Random();
        for (int i = 0; i < 50; i++) {
            testTwoList.add(theGenerator.nextInt(101));
        }
        //When
        OddNumbersExterminator test2 = new OddNumbersExterminator();
        test2.exterminate(testTwoList);
        //Then
        for (Integer evens: testTwoList) {
            if (evens % 2 == 0)
            {
                System.out.println("Test");
            }
        }

    }
}

