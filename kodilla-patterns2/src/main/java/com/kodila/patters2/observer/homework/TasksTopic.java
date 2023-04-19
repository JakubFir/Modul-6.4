package com.kodila.patters2.observer.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TasksTopic implements TaskTopicObservable {

    private List<TaskTopicObserver> observers;
    private Map<Student, String> taskList;
    private String name;

    public TasksTopic(String name) {
        observers = new ArrayList<>();
        taskList = new HashMap<>();
        this.name = name;
    }

    public void addTask(String task, Student student) {
        taskList.put(student, task);
        notifyObserver(student);
    }


    @Override
    public void registerObserver(TaskTopicObserver tasksTopicObserver) {
        observers.add(tasksTopicObserver);
    }

    @Override
    public void notifyObserver(Student student) {
        for (TaskTopicObserver observer : observers) {
            observer.update(this, student);
        }
    }

    @Override
    public void removeObserver(TaskTopicObserver tasksTopicObserver) {
        observers.remove(tasksTopicObserver);
    }

    public Map<Student, String> getTaskList() {
        return taskList;
    }

    public String getName() {
        return name;
    }
}

