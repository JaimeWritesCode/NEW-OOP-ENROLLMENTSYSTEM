package org.example.service;
import  org.example.model.Course;
import org.example.model.Student;
import java.util.List;


public interface CourseReg {
    void saveCourse(Course course);
    void displayAllCourse();
    void updateCourse(Course course);
    String removeCourse(Course course);
}
