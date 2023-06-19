package com.cjss.training.model;

public class Subjects {
    private String subjectName;
    private int subjectId;
    private String year;
    private String branch;

    public Subjects() {
    }

    public Subjects(String subjectName, int subjectId, String year, String branch) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.year = year;
        this.branch = branch;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
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

    @Override
    public String toString() {
        return "Subjects{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectId=" + subjectId +
                ", year='" + year + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
