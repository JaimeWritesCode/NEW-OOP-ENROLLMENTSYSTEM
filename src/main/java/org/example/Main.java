package org.example;

import org.example.model.*;
import org.example.service.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Pass all three implementations
        CampusRegistrar campusRegistrar = new CampusRegistrar(
                new StudentRegistrationImpl(),
                new InstructorRegistrationImpl(),
                new DepartmentRegistrationImpl()
        );

        System.out.println("Just branch fixing");

        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(new Instructor("3766", "John Doe", 30, new ArrayList<>(), new ArrayList<>()));

        // This now matches your screenshot exactly
        campusRegistrar.saveDepartment(new Department("CITE", "College of IT", instructorList));
        campusRegistrar.displayAllDepartment();

        List<Student> studentList = new ArrayList();

        campusRegistrar.saveStudent(new Student("1234", "DanTDM", 15));
        campusRegistrar.displayAllStudent();
    }
}
