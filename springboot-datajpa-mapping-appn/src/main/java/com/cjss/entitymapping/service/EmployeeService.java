package com.cjss.entitymapping.service;

import com.cjss.entitymapping.model.EmployeeEntity;
import com.cjss.entitymapping.repository.AddressRepository;
import com.cjss.entitymapping.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private AddressRepository  addressRepository;

    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        EmployeeEntity employeeEntity1 = employeeRepository.save(employeeEntity);
        return employeeEntity1;
    }
}
