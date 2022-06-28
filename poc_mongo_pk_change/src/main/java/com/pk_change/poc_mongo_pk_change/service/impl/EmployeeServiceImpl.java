package com.pk_change.poc_mongo_pk_change.service.impl;

import com.pk_change.poc_mongo_pk_change.model.EmployeeModel;
import com.pk_change.poc_mongo_pk_change.repository.EmployeeRepository;
import com.pk_change.poc_mongo_pk_change.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public EmployeeModel getEmployeeDetails(String name) {
        return employeeRepository.findById(name).get();
    }

    @Override
    public EmployeeModel addEmployeeDetails(EmployeeModel employeeModel) {
        return employeeRepository.save(employeeModel);
    }

    @Override
    public EmployeeModel updateEmployeeDetails(EmployeeModel employeeModel) {
        EmployeeModel employee = employeeRepository.findById(employeeModel.getFirstName()).get();
        employee.setLastName(employeeModel.getLastName());
        employee.setSalary(employeeModel.getSalary());
        employee.setAddress(employeeModel.getAddress());
        return employeeRepository.save(employee);
    }
}
