package com.cjss.model;

import jakarta.validation.constraints.*;

public class UserModel {
    @NotNull
    private int id;
    @NotEmpty
    @Size(min=2, message="name should have at least 2 characters")
    private String name;
    @Positive
    private double salary;
    @Email
    @Size(min=5, message = "")
    private String email;

    public UserModel() {
    }

    public UserModel(int id, String name, double salary, String email) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
