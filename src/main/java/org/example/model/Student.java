package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private List<Section> enrolledSections;

    public Student() {
        this("Null", "Unknown", 0);
    }

    private double tuitionFee;

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public Student(String ID, String name, int age) {
        super(ID, name, age);
        this.enrolledSections = new ArrayList<>();
    }

    @Override
    public void mainTask() {
        System.out.println("Main task: To go school and learn.");
    }

    public String getStudentId() {
        return super.getPersonID();
    }

    public List<Section> getEnrolledSections() {
        return enrolledSections;
    }

    public void displayID() {
        System.out.println("Student ID: " + super.getPersonID());
    }

    public void displayName() {
        System.out.println("Student Name: " + super.getName());
    }


}