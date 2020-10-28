package com.kodilla.hibernate.manytomany.facade;

public class CompanyEmployeeProcessingException extends Exception {
    public static String ERR_NOT_FOUND_COMPANY_NAME = "There is no such a name for company.";
    public static String ERR_NOT_FOUND_EMPLOYEE_NAME = "There is no such name for employee.";
    public CompanyEmployeeProcessingException(String message){
        super(message);
    }
}
