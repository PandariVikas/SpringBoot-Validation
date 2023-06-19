package com.cjss.training.model;

import java.util.Map;

public class Student {
    private String studentName;
    private String email;
    private String year;
    private String branch;
    StudentMarks studentMarks;
    Attendance studentAttendance;

    public Student() {
    }

    public Student(String studentName, String email, String year, String branch, StudentMarks studentMarks, Attendance studentAttendance) {
        this.studentName = studentName;
        this.email = email;
        this.year = year;
        this.branch = branch;
        this.studentMarks = studentMarks;
        this.studentAttendance = studentAttendance;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public StudentMarks getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(StudentMarks studentMarks) {
        this.studentMarks = studentMarks;
    }

    public Attendance getStudentAttendance() {
        return studentAttendance;
    }

    public void setStudentAttendance(Attendance studentAttendance) {
        this.studentAttendance = studentAttendance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", email='" + email + '\'' +
                ", year='" + year + '\'' +
                ", branch='" + branch + '\'' +
                ", studentMarks=" + studentMarks +
                ", studentAttendance=" + studentAttendance +
                '}';
    }
}
