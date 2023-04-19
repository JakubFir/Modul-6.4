package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CompanyFacadeTest {

    @Autowired
    private CompanyFacade companyFacade;


    @Test
    void retrieveCompanyNameByFewLetters() {
        //Given
        Company softwareMachine = new Company("Software Machine");

        //When
        companyFacade.addCompany(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        List<Company> companies = companyFacade.searchCompanyByFewLetters("mach");
        //Then
        assertEquals(1, companies.size());

        //CleanUp
        try {
            companyFacade.deleteById(softwareMachineId);
        } catch (Exception e) {
            //do nothing
        }
    }
}