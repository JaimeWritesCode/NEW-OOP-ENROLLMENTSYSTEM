package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Section {
    private String sectionId;
    private String sectionName;
    private int maxCapacity;
    private Instructor assignedInstructor;
    private List<Student> enrolledStudents;

    public Section(String sectionId, String sectionName) {
        this.sectionId = sectionId;
        this.sectionName = sectionName;
        this.maxCapacity = 25; // Set to 25 by default
        this.enrolledStudents = new ArrayList<>();
    }

    public Section(String sectionId, String sectionName, int maxCapacity) {
        this.sectionId = sectionId;
        this.sectionName = sectionName;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    public String getSectionName() {
        return sectionName;
    }

    public void setAssignedInstructor(Instructor instructor) {
        this.assignedInstructor = instructor;
    }

    public Instructor getAssignedInstructor() {
        return assignedInstructor;
    }

}