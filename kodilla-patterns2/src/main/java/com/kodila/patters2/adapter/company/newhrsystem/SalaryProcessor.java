package com.kodila.patters2.adapter.company.newhrsystem;


import java.math.BigDecimal;
import java.util.List;

public interface SalaryProcessor {
    BigDecimal calculateSalaries(List<Employee> employees);
}