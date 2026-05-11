package org.example;

import org.example.model.*;
import org.example.service.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Initialize Services
        IStudentService studentService = new IStudentServiceImpl();
        ITuitionService tuitionService = new TuitionServiceImpl();
        IEnrollmentService enrollmentService = new PersonEnrollment();
        InstructorReg instructorService = new InstructorRegistrationImpl();
        DepartmentReg departmentService = new DepartmentServiceImpl();

        CampusRegistrar registrar = new CampusRegistrar(
                studentService, instructorService, departmentService, tuitionService, enrollmentService
        );

        // Set up Department & Staff
        Department cite = new Department("D01", "College of Information Technology and Engineering", new ArrayList<>());
        Instructor prof = new Instructor("P01", "Seb", 45, "Cybersecurity");
        Instructor prof1 = new Instructor("P01", "Abigail", 50, "Cybersecurity");

        // Define Sections
        Section javaSection = new Section("S01", "Security Section", 30);
        javaSection.setAssignedInstructor(prof);

        Section smallClassroom = new Section("S02", "Inteprog Section", 1);
        smallClassroom.setAssignedInstructor(prof1);

        Section mediumClassroom= new Section("S03", "Math Section", 2);
        smallClassroom.setAssignedInstructor(prof);

        // Link a section to a department
        cite.getSections().add(javaSection);
        cite.getSections().add(smallClassroom);

        // Define Students
        Student s1 = new Student("S101", "Leo", 20);
        Student s2 = new Student("S102", "Alex", 21);
        Student s3 = new Student("S103", "Shown", 19);
        s2.setTuitionFee(6500.0); // High Debt for Alex

        System.out.println("==========================================");
        System.out.println(" Jaime Enrollment System");
        System.out.println("==========================================\n");

        // Enrollment Validation Accepted
        System.out.println("Registrar Enrolling student Leo in javasection:");
        registrar.processEnrollment(s1, javaSection);
        System.out.println("==========================================\n");

        // Enrollment Rejected
        System.out.println("Registrar Enrolling Student Alex in javaSection (Debt: $6,500 [Ineligible] ):");
        registrar.processEnrollment(s2, javaSection);
        System.out.println("==========================================\n");


        System.out.println("Testing Classroom Capacity (Limit: 1)");
        registrar.processEnrollment(s1, smallClassroom); // First student - Success
        registrar.processEnrollment(s3, smallClassroom); // Second student -Reject since full
        registrar.processEnrollment(s2, smallClassroom); // Third student - Should Reject (Full + Debt)
        System.out.println("==========================================\n");

        System.out.println("Testing Classroom Capacity (Limit: 2)");
        registrar.processEnrollment(s1, mediumClassroom); // First student - Success
        registrar.processEnrollment(s3, mediumClassroom); // Second student - Success
        registrar.processEnrollment(s2, smallClassroom); // Third student - Should Reject (Full + Debt)

        // Full Hierarchy of things
        System.out.println("\n==========================================");
        System.out.println(" INSTITUTIONAL HIERARCHY VIEW");
        System.out.println("==========================================");

        System.out.println("DEPARTMENT: " + cite.getDepartmentName());
        System.out.println("==========================================");

        for (Section sec : cite.getSections()) {
            System.out.println(" SECTION: " + sec.getSectionName() + " (" + sec.getSectionId() + ")");

            // Show Professor
            String profName = (sec.getAssignedInstructor() != null) ? sec.getAssignedInstructor().getName() : "None Assigned";
            System.out.println(" INSTRUCTOR: " + profName);

            // Show Students
            System.out.println(" ENROLLED STUDENTS:");
            if (sec.getEnrolledStudents().isEmpty()) {
                System.out.println(" (No students enrolled)");
            } else {
                for (Student s : sec.getEnrolledStudents()) {
                    System.out.println(" - " + s.getName() + " [" + s.getStudentId() + "]");
                    System.out.println("==========================================");

                }
            }
        }

        System.out.println(" SYSTEM HAS BEEN EXECUTED SUCCESSFULLY!");
        System.out.println("==========================================");
    }
}