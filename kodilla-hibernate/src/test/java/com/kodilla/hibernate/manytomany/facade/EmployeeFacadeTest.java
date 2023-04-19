package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeFacadeTest {

    @Autowired
    private EmployeeFacade employeeFacade;

    @Test
    void searchCompanyByFewLetters() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee employee = new Employee("John", "mithici");

        //When
        employeeFacade.addEmployee(johnSmith);
        employeeFacade.addEmployee(employee);
        List<Employee> employeesByFewLetters = employeeFacade.searchEmployeeByFewLetters("ith");
        String lastname = employeesByFewLetters.get(0).getLastname();

        //Then
        assertEquals("Smith", lastname);
        assertEquals(2,employeesByFewLetters.size());

        //CleanUp
        try {
            employeeFacade.deleteById(johnSmith.getId());
            employeeFacade.deleteById(employee.getId());
        } catch (Exception e) {
            //do nothing
        }
    }
}