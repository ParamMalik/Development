package com.pk_change.poc_mongo_pk_change.service;

import com.pk_change.poc_mongo_pk_change.model.EmployeeModel;

public interface EmployeeService {
    EmployeeModel getEmployeeDetails(String name);
    EmployeeModel addEmployeeDetails(EmployeeModel employeeModel);
    EmployeeModel updateEmployeeDetails(EmployeeModel employeeModel);
}
