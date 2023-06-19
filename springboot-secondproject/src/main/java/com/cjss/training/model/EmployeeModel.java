package com.cjss.training.model;

import java.util.List;

public class EmployeeModel {
    private int employeeId;
    private String employeeName;
    private double salary;
    Location location;
    DepartmentModel depts;
    List<Benefits> benefits;

    public EmployeeModel() {
    }

    public EmployeeModel(int employeeId, String employeeName, double salary, Location location, DepartmentModel depts, List<Benefits> benefits) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.location = location;
        this.depts = depts;
        this.benefits = benefits;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public DepartmentModel getDepts() {
        return depts;
    }

    public void setDepts(DepartmentModel depts) {
        this.depts = depts;
    }

    public List<Benefits> getBenefits() {
        return benefits;
    }

    public void setBenefits(List<Benefits> benefits) {
        this.benefits = benefits;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                ", location=" + location +
                ", depts=" + depts +
                ", benefits=" + benefits +
                '}';
    }
}
