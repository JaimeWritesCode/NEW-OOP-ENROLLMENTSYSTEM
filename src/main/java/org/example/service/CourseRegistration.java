package org.example.service;

import org.example.model.Course;
import java.util.ArrayList;

public class CourseRegistration implements CourseReg {
    private ArrayList<Course> courses = new ArrayList<>();

    @Override
    public void saveCourse(Course course) {
        courses.add(course);
    }

    // THIS IS THE FIX: It must match the interface name exactly
    @Override
    public void displayAllCourse() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    @Override
    public void updateCourse(Course course) {
        // Your update logic here
    }

    @Override
    public String removeCourse(Course course) {
        return courses.remove(course) ? "Success" : "Failed";
    }
}