package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;


    private List<String> executedTasks = new ArrayList<>();

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
