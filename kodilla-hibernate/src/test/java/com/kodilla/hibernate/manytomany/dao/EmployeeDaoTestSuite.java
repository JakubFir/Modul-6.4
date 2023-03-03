package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmployeeDaoTestSuite {

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testEmployeeNamedQuery() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        //when
        employeeDao.save(johnSmith);
        List<Employee> employeesByLastName = employeeDao.retrieveEmployeeByLastName("Smith");
        String lastname = employeesByLastName.get(0).getLastname();
        //then
        assertEquals("Smith", lastname);

        //CleanUp
        employeeDao.deleteById(johnSmith.getId());
    }
}
