package org.example.model;

public abstract class Person {
    private String ID;
    private String name;
    private String course;
    private int age;


    public abstract void mainTask();

    public Person(String ID, String name, String course, int age){
        this.ID = ID;
        this.name = name;
        this.course = course;
        this.age = age;
    }

    public Person(String ID, String name, int age){
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public Person(String course){

    }

    public Person() {

    }

    public String getPersonID() {
        return ID;
    }

    public void setPersonID(String ID) {
        this.ID = ID;
    }

    public String getName(){
        return name;
    }

    public void setPersonName(String name){
        this.name = name;
    }

    public String getCourse(){
        return course;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


}

