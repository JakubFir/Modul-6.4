package com.kodila.patters2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TasksTopicTest {


    @Test
    void taskTopic() {
        //Given
        TasksTopic javaTasks = new JavaTasks();
        Student jack = new Student("Jack");
        Student student = new Student("Student");

        Mentor jackMentor = new Mentor("Bob");
        jackMentor.addStudent(jack);

        Mentor studentMentor = new Mentor("foo");
        studentMentor.addStudent(student);


        javaTasks.registerObserver(jackMentor);
        javaTasks.registerObserver(studentMentor);

        //When
        javaTasks.addTask("facade help", jack);
        javaTasks.addTask("decorator help", student);
        javaTasks.addTask("decorator help1", student);
        javaTasks.addTask("decorator help2", student);
        javaTasks.addTask("facade help", jack);

        //Then
        assertEquals(2, jackMentor.getUpdateCount());
        assertEquals(3, studentMentor.getUpdateCount());


    }

}