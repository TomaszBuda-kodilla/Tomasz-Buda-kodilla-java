package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.lang.reflect.Array;
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
        OddNumbersExterminator test2 = new OddNumbersExterminator();
        ArrayList<Integer> testTwoList = new ArrayList<>();
        testTwoList.add(2);
        testTwoList.add(4);
        testTwoList.add(6);
        //When
        ArrayList<Integer> testTwoListTrue = new ArrayList<>();
        testTwoListTrue.add(2);
        testTwoListTrue.add(4);
        testTwoListTrue.add(6);
        //Then
        Assert.assertEquals(testTwoListTrue.get(0),test2.exterminate(testTwoListTrue).get(0));
        Assert.assertEquals(testTwoListTrue.get(1),test2.exterminate(testTwoListTrue).get(1));
        Assert.assertEquals(testTwoListTrue.get(2),test2.exterminate(testTwoListTrue).get(2));
        }

    }
}

