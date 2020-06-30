package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board  = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("Test");
        //Then
        Assert.assertEquals("Test",board.getToDoList().getTasks().get(0));
    }
}
