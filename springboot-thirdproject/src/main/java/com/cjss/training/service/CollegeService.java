package com.cjss.training.service;

import com.cjss.training.model.Staff;
import com.cjss.training.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CollegeService {
       private List<Student> studentDetails= new ArrayList<>();
       private List<Staff> staffDetails= new ArrayList<>();
       public List<Student> addStudent(Student student){
           Student students= new Student();
            students.setStudentName(student.getStudentName());
            students.setBranch(student.getBranch());
            students.setStudentAttendance(student.getStudentAttendance());
            students.setStudentMarks(student.getStudentMarks());
            students.setEmail(student.getEmail());
            students.setYear(student.getYear());
            studentDetails.add(students);
            return studentDetails;
       }
       public List<Staff> addStaff(Staff staff){
           Staff staffs= new Staff();
           staffs.setStaffName(staff.getStaffName());
           staffs.setEmail(staff.getEmail());
           staffs.setStaffAttendance(staff.getStaffAttendance());
           staff.setSubjects(staff.getSubjects());
           staffDetails.add(staff);
           return staffDetails;
       }
       //*****Retrieve Student details in year 1*****

        public List<Student> getStudents(String year){
         List<Student> students= studentDetails.stream().filter(stud->stud.getYear().equals(year)).collect(Collectors.toList());
         return students;
        }

    public List<Staff> getStaff(String year) {
           List<Staff> staffs= staffDetails.stream().filter(staff->staff.getSubjects().stream().anyMatch(s->s.getYear().equals(year))).collect(Collectors.toList());
           return  staffs;
    }

    public List<Student> getStudentWhoPresentTodayInYear1(String year, String branch, LocalDate date) {
           List<Student> students= studentDetails.stream().filter(stud->stud.getYear().equals(year) && stud.getBranch().equals(branch)&&stud.getStudentAttendance().getDate().equals(date)).collect(Collectors.toList());
           return students;
    }

    public List<Staff> getStaffDetails(String subject, LocalDate date) {
           List<Staff> staffs= staffDetails.stream().filter(staff->staff.getStaffAttendance().getDate().equals(date)&& staff.getSubjects().stream().anyMatch(s->s.getSubjectName().equals(subject))).collect(Collectors.toList());
           return staffs;
    }

    public List<Student> getStudentWhoNotPassedInYear1(String year) {
           List<Student> students = studentDetails.stream().filter(stud->stud.getStudentMarks().getMarks()<35&& stud.getYear().equals(year)).collect(Collectors.toList());
           return students;
    }

    public List<Staff> getStaffWhoTeachesMoreThan2Subjects(String year) {
           List<Staff> staffs= staffDetails.stream().filter(staff->staff.getSubjects().size()>=2 && staff.getSubjects().stream().anyMatch(s->s.getYear().equals(year))).collect(Collectors.toList());
           return staffs;
    }
}
