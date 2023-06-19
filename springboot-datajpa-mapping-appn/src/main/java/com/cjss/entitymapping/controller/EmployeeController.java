package com.cjss.entitymapping.controller;

import com.cjss.entitymapping.model.EmployeeEntity;
import com.cjss.entitymapping.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmployeeAndAddress")
    public EmployeeEntity addEmployeeAndAddress(@Valid @RequestBody EmployeeEntity employeeEntity){
        EmployeeEntity employees = employeeService.saveEmployee(employeeEntity);
        return employees;
    }

}
