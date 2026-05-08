package org.example.model;

import java.util.List;
import java.util.ArrayList;

public class Instructor extends Person {
    private List<Course> courseList;
    private List<Student> students;


    // Fixed constructor to match Person(String ID, String name, int age)
    public Instructor(String ID, String name, int age, List<Course> courseList, List<Student> students) {
        super(ID, name, age);
        this.courseList = courseList;
        this.students = students;
    }

    public interface InstructorRegistration {
        void saveInstructor(Instructor instructor);
        void displayAllInstructor();
    }

    public Instructor() {
        super("Unknown", "Unknown", 0);
        this.courseList = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    @Override
    public void mainTask() {
        System.out.println("Main task: to teach.");
    }

    // Restored your specific display methods
    public void displayID() {
        // Uses the getter from the abstract Person class
        System.out.println("Instructor ID: " + super.getPersonID());
    }

    public void displayName() {
        // Uses the getter from the abstract Person class
        System.out.println("Instructor Name: " + super.getName());
    }

    public void displayCourse() {
        // Ensure getCourse() exists in Person, otherwise use courseList
        System.out.println("Teaching Courses: " + courseList);
    }

    // Logic for the Service layer to use
    public List<Course> displayCourseList() {
        return courseList.stream().toList();
    }

    public List<Student> displayStudentList() {
        return students.stream().toList();
    }


}