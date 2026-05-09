package org.example.service;

import org.example.model.Course;
import java.util.ArrayList;
import java.util.List;

public class ICourseRegistration implements ICourseReg {
    private List<Course> courses = new ArrayList<>();

    @Override
    public void addCourse(Course course) {
        courses.add(course);
        System.out.println(" The Course has been saved successfully!");
    }

    @Override
    public List<Course> getAllCourses() {
        return new ArrayList<>(courses);
    }

    @Override
    public void updateCourse(Course updatedCourse) {
        // Note: this boolean removed line works similarly to a for-each loop
        // Note: removeIf deletes the current ID if it matches updatedCourse
        boolean removed = courses.removeIf(c -> c.getCourseID().equals(updatedCourse.getCourseID()));

        if (removed) {
            courses.add(updatedCourse);
            System.out.println(" The Course information has updated successfully!");
        } else {
            System.out.println(" Error: Course ID has not been found.");
        }
    }

    @Override
    public void removeCourse(String courseId) {

        boolean removed = courses.removeIf(c -> c.getCourseID().equals(courseId));

        if (removed) {
            System.out.println(" Course with ID " + courseId + " has been removed.");
        } else {
            System.out.println(" Error: Course ID " + courseId + " is not found.");
        }
    }
}