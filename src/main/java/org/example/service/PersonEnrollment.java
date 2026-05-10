package org.example.service;

import org.example.model.*; // To get Student, Section, and SectionFullException

public class PersonEnrollment implements IEnrollmentService {


    @Override
    public void enrollStudentInSection(Student student, Section section) throws SectionFullException {
        if (section.getEnrolledStudents().size() >= section.getMaxCapacity()) {
            throw new SectionFullException("🛑 Enrollment Failed: " + section.getSectionName() + " is full!");
        }

        section.getEnrolledStudents().add(student);
    }
}