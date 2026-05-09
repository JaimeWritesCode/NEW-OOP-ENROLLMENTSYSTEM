package org.example.model;

public class Instructor extends Person {
    private String specialization; // Simple attribute

    public Instructor(String ID, String name, int age, String specialization) {
        super(ID, name, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void mainTask() {
        System.out.println("Main Task: To Teach");
    }
}