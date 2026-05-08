package org.example.service;
import org.example.model.Person;
import org.example.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonEnrollment {
    private ArrayList<Person> personArrayList = new ArrayList();
    Scanner scan = new Scanner(System.in);

    //Create
    public void addPerson(Person person){
        personArrayList.add(person);
    }

    //Read
    public void displayAll(){
        System.out.println(personArrayList);
    }


    //Update
    public void updatePerson(Person person){
        for(int i = 0; i < personArrayList.size(); i++){
            if(personArrayList.get(i).getPersonID() == (person.getPersonID())){
                personArrayList.set(i, person);
                break;
            }
        }
    }


    //Remove
    public String delete(Person person) {
        for (int i = 0; i < personArrayList.size(); i++) {
            if (personArrayList.get(i).getPersonID() == (person.getPersonID())) {
                personArrayList.remove(i);
                return "Successfully Deleted";
            }
        }
        return "Error";
    }

}


