package org.example.service;
import org.example.model.Student;

public interface IStudentService {
    void addStudent(Student student);
    void updateStudent(Student student);
    void removeStudent(String studentID);
    void displayAllStudents();
}