package com.cjss.training.controller;

import com.cjss.training.model.Staff;
import com.cjss.training.model.Student;
import com.cjss.training.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class CollegeController {
    @Autowired
    private CollegeService service;

    @PostMapping("/add-student")
    public List<Student> addStudent(@RequestBody Student student){
        List<Student> students= service.addStudent(student);
        return  students;
    }
    @PostMapping("/add-staff")
    public List<Staff>  addStaff(@RequestBody Staff staff){
        List<Staff> staffs= service.addStaff(staff);
        return staffs;
    }

    //*****Retrieve Student details in year 1*****
    @GetMapping("/get-student-based-on-year/{year}")
    public List<Student> getStudentsInYear1(@PathVariable String year ){
        List<Student> students= service.getStudents(year);
        return students;
    }

    //****Retrieve staff details who teach year 1****
    @GetMapping("/get-staff-based-on-year/{year}")
    public List<Staff> getStaffInYear1(@PathVariable String year){
        List<Staff> staffs= service.getStaff(year);
        return staffs;
    }
    //** Retrieve Student who is present today in year 1 and branch CSE **
    @GetMapping("/get-student-based-branch-year/{year}/{branch}/{date}")
    public List<Student> getStudentDetails(@PathVariable String year, @PathVariable String branch, @PathVariable LocalDate date){
    List<Student> studs = service.getStudentWhoPresentTodayInYear1(year, branch, date);
        return studs;
    }
//    ****Retrieve staff who is present today and who teaches Subject1****
    @GetMapping("/get-staff-subject/{subject}/{date}")
    public List<Staff> getStaffDetails(@PathVariable String subject, @PathVariable LocalDate date){
        List<Staff> staffs= service.getStaffDetails(subject, date);
        return staffs;
    }
    //** Retrieve students who are not passed in year 1**
    @GetMapping("/get-student-whoarenotpass/{year}")
    public List<Student> getStudentWhoNotPass(@PathVariable String year){
        List<Student> students= service.getStudentWhoNotPassedInYear1(year);
        return students;
    }
//    **Retrieve staff who teaches more than 2 subjects in year 2**
    @GetMapping("/get-staff-whoteaches-2subjects/{year}")
    public List<Staff> getStaffWhoTeachesMoreThan2Subjects(@PathVariable String year){
        List<Staff> staffs= service.getStaffWhoTeachesMoreThan2Subjects(year);
        return staffs;
    }
}
