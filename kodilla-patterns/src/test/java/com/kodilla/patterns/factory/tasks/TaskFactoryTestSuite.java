package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void drivingTaskIsTaskExecuted() {
        //given
        TaskFactory factory = new TaskFactory();
        //then
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        //when
        boolean res = drivingTask.isTaskExecuted();
        assertFalse(res);
    }

    @Test
    void drivingTaskExecuteTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //then
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        //when
        assertFalse(drivingTask.isTaskExecuted());
        drivingTask.executeTask();
        assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    void drivingTaskGetTaskName() {
        //given
        TaskFactory factory = new TaskFactory();
        //then
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        //when
        String res = drivingTask.getTaskName();
        assertEquals("Driving task", res);
    }

    @Test
    void paintingTaskIsTaskExecuted() {
        //given
        TaskFactory factory = new TaskFactory();
        //then
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        //when
        boolean res = paintingTask.isTaskExecuted();
        assertFalse(res);
    }

    @Test
    void paintingTaskExecuteTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //then
        Task drivingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        //when
        assertFalse(drivingTask.isTaskExecuted());
        drivingTask.executeTask();
        assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    void paintingTaskGetTaskName() {
        //given
        TaskFactory factory = new TaskFactory();
        //then
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        //when
        String res = paintingTask.getTaskName();
        assertEquals("Painting task", res);
    }

    @Test
    void shoppingTaskIsTaskExecuted() {
        //given
        TaskFactory factory = new TaskFactory();
        //then
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //when
        boolean res = shoppingTask.isTaskExecuted();
        assertFalse(res);

    }

    @Test
    void shoppingTaskExecuteTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //then
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //when
        assertFalse(shoppingTask.isTaskExecuted());
        shoppingTask.executeTask();
        assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    void shoppingTaskGetTaskName() {
        //given
        TaskFactory factory = new TaskFactory();
        //then
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //when
        String res = shoppingTask.getTaskName();
        assertEquals("Shopping task", res);
    }
}
