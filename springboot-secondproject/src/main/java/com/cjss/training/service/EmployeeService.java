package com.cjss.training.service;

import com.cjss.training.model.Benefits;
import com.cjss.training.model.DepartmentModel;
import com.cjss.training.model.EmployeeModel;
import com.cjss.training.model.Location;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    private List<EmployeeModel> employeeModels = new ArrayList<>();

        public List<EmployeeModel> add(EmployeeModel employeeModel){
        EmployeeModel employee = new EmployeeModel();

            employee.setEmployeeId(employeeModel.getEmployeeId());
            employee.setEmployeeName(employeeModel.getEmployeeName());
            employee.setSalary(employeeModel.getSalary());
            employee.setBenefits(employeeModel.getBenefits());
            employee.setDepts(employeeModel.getDepts());
            employee.setLocation(employeeModel.getLocation());
            employeeModels.add(employeeModel);
        return employeeModels;
    }

    public List<EmployeeModel> getEmployee(String locationCountry){
    List<EmployeeModel> employee= employeeModels.stream().filter(emp->emp.getLocation().getLocationCountry().equals(locationCountry)).collect(Collectors.toList());
    return employee;
        }

    public List<EmployeeModel> getEmployeeByLocationName(String locationName1, String locationName2){
        List<EmployeeModel> employee= employeeModels.stream().filter(emp->emp.getLocation().getLocationName().equals(locationName1)||emp.getLocation().getLocationName().equals(locationName2)).collect(Collectors.toList());
        return employee;
    }

    public List<EmployeeModel> getEmployeeBenefits() {
        employeeModels.forEach(emp -> {
            if (emp.getBenefits() != null) {
                List<EmployeeModel> employee = employeeModels.stream().collect(Collectors.toList());

            }
        });
        return employeeModels;
    }

    public List<EmployeeModel> getAllEmployees(){
            List<EmployeeModel> emps = employeeModels.stream().collect(Collectors.toList());
            return emps;
    }

        public List<EmployeeModel> getEmployeeByCountry(String locationName, String countryName){
            List<EmployeeModel> employee= employeeModels.stream().filter(emp->emp.getLocation().getLocationName().equals(locationName)&&emp.getLocation().getLocationCountry().equals(countryName)).collect(Collectors.toList());
            return employee;
        }

}
