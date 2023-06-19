package com.cjss.rest.service;

import com.cjss.rest.entity.StudentEntity;
import com.cjss.rest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public ResponseEntity<StudentEntity> saveStudent(StudentEntity student ){
        StudentEntity studentEntity = studentRepository.save(student);
        return new ResponseEntity<>(studentEntity, HttpStatus.OK);
    }
}
