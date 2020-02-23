package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task shopping = task.makeTask(TaskFactory.SHOP);
        //Then
        Assert.assertEquals("shopping",shopping.getTaskName());
        Assert.assertEquals(true,shopping.isTaskExecuted());
        Assert.assertEquals( "shoes - 2.0 pcs.",shopping.executeTask());
    }
    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task painting = task.makeTask(TaskFactory.PAINT);
        //Then
        Assert.assertEquals("painting",painting.getTaskName());
        Assert.assertEquals(true,painting.isTaskExecuted());
        Assert.assertEquals( "You are taking red color and painting doors",painting.executeTask());
    }
    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task driving = task.makeTask(TaskFactory.DRIVE);
        //Then
        Assert.assertEquals("driving",driving.getTaskName());
        Assert.assertEquals(true,driving.isTaskExecuted());
        Assert.assertEquals( "I am driving to to New York by my Ford Mustang",driving.executeTask());
    }

}