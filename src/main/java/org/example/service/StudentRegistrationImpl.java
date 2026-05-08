package org.example.service;

import org.example.model.Student;
import java.util.ArrayList;

public class StudentRegistrationImpl implements StudentRegistration {

    private ArrayList<Student> students = new ArrayList<>();

    @Override
    public void saveStudent(Student student) {
        students.add(student);
    }

    @Override
    public void displayAllStudent() {
        for (Student student : students) {
            // Assuming your Student model has a getName() method
            System.out.println("Student ID: " + student.getPersonID() + " | Name: " + student.getName());
        }
    }

    @Override
    public void updateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getPersonID().equals(student.getPersonID())) {
                students.set(i, student);
                return;
            }
        }
    }

    // THE FIX: Adding the missing method to satisfy the Interface
    @Override
    public String removeStudent(Student student) {
        if (students.remove(student)) {
            return "Student removed successfully.";
        } else {
            return "Student not found.";
        }
    }
}