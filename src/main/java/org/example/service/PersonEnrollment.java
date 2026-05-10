package org.example.service;

import org.example.model.*;

public class PersonEnrollment implements IEnrollmentService {


    @Override
    public void enrollStudentInSection(Student student, Section section) throws SectionFullException {
        if (section.getEnrolledStudents().size() >= section.getMaxCapacity()) {
            throw new SectionFullException("CAPACITY REJECTION: [SECTION] " + section.getSectionName() + " is full!");
        }
        section.getEnrolledStudents().add(student);
        student.getEnrolledSections().add(section);
    }
}