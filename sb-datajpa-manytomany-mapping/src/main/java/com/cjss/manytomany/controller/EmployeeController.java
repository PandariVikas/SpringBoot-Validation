package com.cjss.manytomany.controller;

import com.cjss.manytomany.model.EmployeeModel;
import com.cjss.manytomany.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService  employeeService;

    public EmployeeModel addEmployeeModel(@RequestBody EmployeeModel employeeModel){
        EmployeeModel employeeModel1= employeeService.saveEmployee(employeeModel);
        return  employeeModel1;
    }

}
