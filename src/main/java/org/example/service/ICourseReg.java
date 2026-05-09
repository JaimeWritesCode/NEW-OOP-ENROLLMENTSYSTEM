package org.example.service;

import org.example.model.Course;
import java.util.List;

public interface ICourseReg {
    void addCourse(Course course);
    void updateCourse(Course course);
    void removeCourse(String courseId); // Changed to String ID
    List<Course> getAllCourses();      // Standardized naming
}