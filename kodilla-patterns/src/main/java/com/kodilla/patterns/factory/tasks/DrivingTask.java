package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;

    private boolean executedTask;
    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        executedTask = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executedTask;
    }
}
