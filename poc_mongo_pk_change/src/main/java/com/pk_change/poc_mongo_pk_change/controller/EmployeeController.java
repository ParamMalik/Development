package com.pk_change.poc_mongo_pk_change.controller;

import com.pk_change.poc_mongo_pk_change.model.EmployeeModel;
import com.pk_change.poc_mongo_pk_change.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/{name}")
    public EmployeeModel getEmployeeDetailsByName(@PathVariable String name) {
        return employeeService.getEmployeeDetails(name);
    }

    @PostMapping
    public EmployeeModel addEmployeeDetails(@RequestBody EmployeeModel employeeModel) {
        return employeeService.addEmployeeDetails(employeeModel);
    }

    @PatchMapping
    public EmployeeModel updateEmployeeDetails(@RequestBody EmployeeModel employeeModel) {
        return employeeService.updateEmployeeDetails(employeeModel);
    }
}
