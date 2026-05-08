package org.example.service;
import org.example.model.Student;

public interface StudentRegistration {
    void saveStudent(Student student);
    void displayAllStudent();
    void updateStudent(Student student);
    // This is the line causing the error
    String removeStudent(Student student);
}