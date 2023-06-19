package com.cjss.training.controller;

import com.cjss.training.model.EmployeeModel;
import com.cjss.training.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
        @PostMapping("/add-employee")
    List<EmployeeModel> add(@RequestBody EmployeeModel employeeModel) {
               List<EmployeeModel>   emps=  employeeService.add(employeeModel);
        return emps;
    }
    //("**Retrieve all employees in India**");
  @GetMapping("/employee-based-on-country/{locationCountry}")
    List<EmployeeModel> getEmployeeByCountry(@PathVariable String locationCountry){
        List<EmployeeModel> employees= employeeService.getEmployee(locationCountry);
        return employees;
    }

    //***Retrieve employees who are in Chennai or Hyderabad***
    @GetMapping("/employees-based-on-location/{locationName1}/{locationName2}")
    List<EmployeeModel> getEmployeeByLocation(@PathVariable String locationName1, @PathVariable String locationName2){
        List<EmployeeModel> employees= employeeService.getEmployeeByLocationName(locationName1, locationName2);
        return employees;
    }
//"**Retrieve employees who have Benefits and display benefits details**"
    @GetMapping("/employee-benefits")
    List<EmployeeModel> getEmployeeBenefits(){
            List<EmployeeModel> employees= employeeService.getEmployeeBenefits();
            return employees;
    }

//    "**Retrieve employee details -  employeeId, employeeName, Salary, deptName, locationName, locationCountry**"
        @GetMapping("/get-all-employee")
    List<EmployeeModel>  gatAll(){
            List<EmployeeModel> employees= employeeService.getAllEmployees();
            return employees;
        }

//    **Retrieve employees who are in Chennai and India**
@GetMapping("/employee-based-on-country-location/{locationName}/{countryName}")
List<EmployeeModel> getEmployeeByLocationCountry(@PathVariable String locationName, @PathVariable String countryName){
    List<EmployeeModel> employees= employeeService.getEmployeeByCountry(locationName, countryName);
    return employees;
}
}
