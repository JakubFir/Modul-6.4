package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;

    private List<String> executedTasks = new ArrayList<>();

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        executedTasks.add(taskName);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executedTasks.contains(taskName);
    }
}
