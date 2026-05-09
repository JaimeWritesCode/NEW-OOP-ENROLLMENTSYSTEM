//package org.example.service;
//
//import org.example.model.Department;
//import org.example.model.Instructor;
//import org.example.model.Student;
//import java.util.List;
//
//public class CampusRegistrar {
//    private IStudentService IStudentService;
//    private InstructorReg instructorRegistration;
//    private DepartmentReg departmentRegistration;
//
//    public CampusRegistrar(IStudentService s, InstructorReg i, DepartmentReg d) {
//        this.IStudentService = s;
//        this.instructorRegistration = i;
//        this.departmentRegistration = d;
//    }
//
//    // --- STUDENT METHODS ---
//    public void saveStudent(Student s) {
//        IStudentService.saveStudent(s);
//    }
//
//    public void displayAllStudent() {
//        // Calls the display method in StudentRegistrationImpl
//        IStudentService.displayAllStudent();
//    }
//
//    // --- INSTRUCTOR METHODS ---
//    public void saveInstructor(Instructor i) {
//        instructorRegistration.saveInstructor(i);
//    }
//
//    public void displayAllInstructor() {
//        // Calls the display method in InstructorRegistrationImpl
//        instructorRegistration.displayAllInstructor();
//    }
//
//    // --- DEPARTMENT METHODS ---
//    public void saveDepartment(Department dept) {
//        departmentRegistration.saveDepartment(dept);
//    }
//
//    public void displayAllDepartment() {
//        List<Department> depts = departmentRegistration.displayAllDepartment();
//        for (Department d : depts) {
//            System.out.print(d.toString());
//        }
//    }
//}