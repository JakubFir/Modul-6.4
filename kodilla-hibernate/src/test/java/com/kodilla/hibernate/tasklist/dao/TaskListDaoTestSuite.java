package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TaskListDaoTestSuite {
    @Autowired
    TaskListDao taskListDao;

    @Test
    void testFindByListName(){
        //given
        TaskList taskList = new TaskList("TaskToDo", "tasks to o");

        //when
        taskListDao.save(taskList);
        List<TaskList> result = taskListDao.findByListName("TaskToDo");

        //then
        assertEquals(result.get(0).getListName(),taskList.getListName());

        //cleanUp
        taskListDao.deleteById(taskList.getId());

    }
}
