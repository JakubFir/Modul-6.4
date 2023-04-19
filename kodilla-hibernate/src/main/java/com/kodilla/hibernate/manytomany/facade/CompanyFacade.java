package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {
    private final CompanyDao companyDao;

    @Autowired
    public CompanyFacade(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    public void addCompany(Company company) {
        companyDao.save(company);
    }

    public void deleteById(Integer id) {
        companyDao.deleteById(id);
    }


    public List<Company> retrieveCompanyNameBy3FirstLetters(String letters) {
        return companyDao.retrieveCompanyNameBy3FirstLetters(letters);
    }


    public List<Company> searchCompanyByFewLetters(String letters) {
        return companyDao.searchCompanyByFewLetters(letters);
    }

}
