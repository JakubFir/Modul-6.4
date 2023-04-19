package com.kodila.patters2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Mentor implements TaskTopicObserver {

    private final String username;

    private List<Student> students;
    private int updateCount;

    public Mentor(String username) {
        students = new ArrayList<>();
        this.username = username;
    }

    @Override
    public void update(TasksTopic tasksTopic, Student student) {
        if (students.contains(student)) {
            updateCount++;
            System.out.println(username + ": New task in topic " + tasksTopic.getName() + " from student " + student.getName() + "\n" +
                    " (total: " + updateCount + " tasks)");
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }


    public int getUpdateCount() {
        return updateCount;
    }
}
