package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeFacade {

    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeFacade(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void deleteById(Integer id){
        employeeDao.deleteById(id);
    }
    public void addEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    public List<Employee> retrieveEmployeeByLastName(String lastname) {
        return employeeDao.retrieveEmployeeByLastName(lastname);
    }

    public List<Employee> searchEmployeeByFewLetters(String letters) {
        return employeeDao.searchEmployeeByFewLetters(letters);
    }
}
