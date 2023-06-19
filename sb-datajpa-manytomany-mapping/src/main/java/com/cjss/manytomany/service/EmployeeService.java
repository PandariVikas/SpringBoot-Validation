package com.cjss.manytomany.service;

import com.cjss.manytomany.model.BenefitsModel;
import com.cjss.manytomany.model.EmployeeModel;
import com.cjss.manytomany.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private BenefitsModel benefitsModel;

    public EmployeeModel saveEmployee(EmployeeModel employeeModel){
        return employeeRepository.save(employeeModel);
    }
}
