package org.example.model;

public class Course {
    private String courseID;
    private String courseName;
    private String program;

    public Course(){

    }

    public Course(String courseID, String courseName, String program){
        this.courseID = courseID;
        this.courseName = courseName;
        this.program = program;
    }

    public String getcourseID(){
        return courseID;
    }

    public void setcourseID(String courseID){
        this.courseID = courseID;
    }

    public String getcourseName(){
        return courseName;
    }

    public void setcourseName(String courseName){
        this.courseName = courseName;
    }

    public String getprogram(){
        return program;
    }

    public void setprogram(String program){
        this.program = program;
    }

    public void displayCourse() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Course Name: " + courseName);
        System.out.println("Program: " + program);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID='" + courseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}
