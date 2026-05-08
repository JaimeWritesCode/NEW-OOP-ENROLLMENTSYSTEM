package org.example.model;

public class Student extends Person {

    @Override
    public void mainTask() {
        System.out.println("Main task: To go school and learn.");
    }

    public Student() {
        this("Null", "Unknown", 0);
    }

    public Student(String ID, String name, int age) {
        super(ID, name, age);
    }

    // Display methods
    public void displayID() {
        System.out.println(super.getPersonID());
    }

    public void displayName() {
        System.out.println(super.getName());
    }

}