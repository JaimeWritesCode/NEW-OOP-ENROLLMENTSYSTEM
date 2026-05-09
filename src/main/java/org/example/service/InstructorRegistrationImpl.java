package org.example.service;

import org.example.model.Instructor;
import java.util.ArrayList;
import java.util.List;

public class InstructorRegistrationImpl implements InstructorReg {

    private List<Instructor> instructors = new ArrayList<>();

    @Override
    public void saveInstructor(Instructor instructor) {
        instructors.add(instructor);
        System.out.println(" Instructor " + instructor.getName() + " has been saved to the system!");
    }

    @Override
    public void displayAllInstructor() {
        if (instructors.isEmpty()) {
            System.out.println("No instructors have been found.");
            return;
        }

        System.out.println("\n--- Instructor List ---");
        for (Instructor i : instructors) {

            System.out.println("ID: " + i.getPersonID() + " | Name: " + i.getName() + " | Specialization: " + i.getSpecialization());
            i.mainTask();
        }
    }
}