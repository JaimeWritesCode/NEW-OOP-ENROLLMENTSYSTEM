package org.example.service;

import org.example.model.*;
import java.util.List;

public class CampusRegistrar {
    private IStudentService studentService;
    private InstructorReg instructorService;
    private DepartmentReg departmentService;
    private ITuitionService tuitionService; // Added for financial order

    public CampusRegistrar(IStudentService s, InstructorReg i, DepartmentReg d, ITuitionService t) {
        this.studentService = s;
        this.instructorService = i;
        this.departmentService = d;
        this.tuitionService = t;
    }

    public void performSecureEnrollment(Student s, Section sec) {
        try {

            double newFee = tuitionService.calculateFee(s);
            System.out.println("Registrar: Enrollment authorized. New balance for " + s.getName() + ": " + newFee);

        } catch (Exception e) {
            System.out.println(" Registrar has been blocked: " + e.getMessage());
        }
    }

    public void showUniversityStructure(String deptId) {

        departmentService.viewDepartmentHierarchy(deptId);
    }


    public void registerStudent(Student s) {
        studentService.addStudent(s);
    }
}