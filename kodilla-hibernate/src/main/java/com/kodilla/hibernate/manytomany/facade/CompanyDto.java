package com.kodilla.hibernate.manytomany.facade;

import java.util.ArrayList;
import java.util.List;

public final class CompanyDto {

    private final Long companyId;
    private final String name;

    public CompanyDto(final Long companyId,final String name){
        this.companyId = companyId;
        this.name = name;
    }
    public Long getCompanyId(){
        return companyId;
    }
    public String getName(){
        return name;
    }

    private final List<EmployeeDto> employees = new ArrayList<>();

    public void addEmployee(final EmployeeDto employee){
        employees.add(employee);
    }
    public List<EmployeeDto> getEmployees(){
        return employees;
    }
}
