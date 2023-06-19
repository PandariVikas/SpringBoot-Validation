package com.cjss.rest.controller;

import com.cjss.rest.entity.StudentEntity;
import com.cjss.rest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/saveStudent")
    public ResponseEntity<StudentEntity> addStudent(@RequestBody StudentEntity student){
        return studentService.saveStudent(student);
    }
}
