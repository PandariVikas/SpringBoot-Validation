package com.cjss.training.model;

public class StudentMarks {
    private int marks;
    private String result;

    public StudentMarks(int marks, String result) {
        this.marks = marks;
        this.result = result;
    }

    public StudentMarks() {
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "marks=" + marks +
                ", result='" + result + '\'' +
                '}';
    }
}
