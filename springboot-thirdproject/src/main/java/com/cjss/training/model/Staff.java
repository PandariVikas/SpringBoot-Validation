package com.cjss.training.model;

import java.util.List;

public class Staff {
    private String staffName;
    private String email;
    Attendance staffAttendance;
    List<Subjects> subjects;

    public Staff() {
    }

    public Staff(String staffName, String email, Attendance staffAttendance, List<Subjects> subjects) {
        this.staffName = staffName;
        this.email = email;
        this.staffAttendance = staffAttendance;
        this.subjects = subjects;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Attendance getStaffAttendance() {
        return staffAttendance;
    }

    public void setStaffAttendance(Attendance staffAttendance) {
        this.staffAttendance = staffAttendance;
    }

    public List<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subjects> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffName='" + staffName + '\'' +
                ", email='" + email + '\'' +
                ", staffAttendance=" + staffAttendance +
                ", subjects=" + subjects +
                '}';
    }
}
