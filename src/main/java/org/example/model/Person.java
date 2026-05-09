package org.example.model;

public abstract class Person {
    private String ID;
    private String name;
    private int age;

    public abstract void mainTask();

    public Person(String ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public String getPersonID() {
        return ID;
    }

    public void setPersonID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}