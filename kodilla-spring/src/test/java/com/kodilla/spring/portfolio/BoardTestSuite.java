package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testDoneList(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getDoneList().addTask("done task");
        //when
        List<String> res = board.getDoneList().getTasks();
        //then
        Assertions.assertEquals("done task",res.get(0));

    }
    @Test
    void testToDoList(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().addTask("task to do");

        //when
        List<String> res = board.getToDoList().getTasks();

        //then
        Assertions.assertEquals("task to do",res.get(0));
    }
    @Test
    void testInProgressList(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getInProgressList().addTask("in progress list");

        //when
        List<String> res = board.getInProgressList().getTasks();
        //then
        Assertions.assertEquals("in progress list",res.get(0));
    }
}
