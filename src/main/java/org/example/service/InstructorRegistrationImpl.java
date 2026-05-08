package org.example.service;

import org.example.model.Instructor;
import java.util.ArrayList;

public class InstructorRegistrationImpl implements InstructorReg {
    // This list ONLY holds Instructors
    private ArrayList<Instructor> instructors = new ArrayList<>();

    @Override
    public void saveInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    @Override
    public void displayAllInstructor() {
        for (Instructor i : instructors) {
            i.displayName();
            i.displayID();
        }
    }
}