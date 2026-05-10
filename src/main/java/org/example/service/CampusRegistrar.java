package org.example.service;

import org.example.model.PaymentValidation;
import org.example.model.SectionFullException;
import org.example.model.*;

public class CampusRegistrar {
    private IStudentService studentService;
    private InstructorReg instructorService;
    private DepartmentReg departmentService;
    private ITuitionService tuitionService;
    private IEnrollmentService enrollmentService;

    public CampusRegistrar(
            IStudentService studentService,
            InstructorReg instructorService,
            DepartmentReg departmentService,
            ITuitionService tuitionService,
            IEnrollmentService enrollmentService
    ) {
        this.studentService = studentService;
        this.instructorService = instructorService;
        this.departmentService = departmentService;
        this.tuitionService = tuitionService;
        this.enrollmentService = enrollmentService;
    }

    public void processEnrollment(Student s, Section sec) {
        try {

            tuitionService.validatePayment(s);

            enrollmentService.enrollStudentInSection(s, sec);

            System.out.println(" Registrar: Enrollment authorized for " + s.getName());

        } catch (PaymentValidation e) {
            System.out.println(" FINANCIAL BLOCK: " + e.getMessage());
        } catch (SectionFullException e) {
            System.out.println(" CAPACITY BLOCK: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(" System Error: " + e.getMessage());
        }
    }

    public void showUniversityStructure(String deptId) {
        departmentService.viewDepartmentHierarchy(deptId);
    }

    public void registerStudent(Student s) {
        studentService.addStudent(s);
    }
}