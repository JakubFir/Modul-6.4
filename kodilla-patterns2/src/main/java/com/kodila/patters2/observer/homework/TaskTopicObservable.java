package com.kodila.patters2.observer.homework;

public interface TaskTopicObservable {
    void registerObserver(TaskTopicObserver tasksTopicObserver);
    void notifyObserver(Student student);

    void removeObserver(TaskTopicObserver tasksTopicObserver);
}
