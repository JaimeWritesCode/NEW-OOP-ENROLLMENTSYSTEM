package org.example.service;

import org.example.model.Student;
import java.util.ArrayList;
import java.util.List;

public class IStudentServiceImpl implements IStudentService {

    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
        System.out.println(" A Student has been added! ");
    }

    @Override
    public void displayAllStudents() {
        System.out.println(students);
    }

    @Override
    public void updateStudent(Student updatedStudent) {

        //Note: removeIf deletes the current personID if the new input matches the old person ID
        //Note: this boolean removed line works similarly to a for-each loop
        boolean removed = students.removeIf(s -> s.getPersonID().equals(updatedStudent.getPersonID()));

        if (removed) {
            students.add(updatedStudent);
            System.out.println(" Student information has been updated!");
        } else {
            System.out.println(" Error: Student ID has not been found.");
        }
    }

    @Override
    public void removeStudent(String studentId) {
        boolean removed = students.removeIf(s -> s.getPersonID().equals(studentId));

        if (removed) {
            System.out.println(" Student with ID " + studentId + " has been removed.");
        } else {
            System.out.println(" ERROR: Student ID has not been found.");
        }
    }
}