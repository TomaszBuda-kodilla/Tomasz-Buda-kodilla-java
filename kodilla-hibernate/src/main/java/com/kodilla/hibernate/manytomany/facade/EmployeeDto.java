package com.kodilla.hibernate.manytomany.facade;

import java.util.ArrayList;
import java.util.List;

public final class EmployeeDto {
    private final List<CompanyDto> companies = new ArrayList<>();

    public void addCompany(final CompanyDto company){
        companies.add(company);
    }

    public List<CompanyDto> getCompanies(){
        return companies;
    }
}
