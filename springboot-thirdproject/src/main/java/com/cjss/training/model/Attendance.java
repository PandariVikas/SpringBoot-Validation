package com.cjss.training.model;

import java.time.LocalDate;

public class Attendance {
    private String attendance;
    LocalDate date;

    public Attendance() {
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "attendance='" + attendance + '\'' +
                ", date=" + date +
                '}';
    }
}
