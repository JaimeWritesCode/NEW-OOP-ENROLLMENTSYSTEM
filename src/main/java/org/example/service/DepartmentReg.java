package org.example.service;

import org.example.model.Department;
import java.util.List;

public interface DepartmentReg {
    void addDepartment(Department dept);
    List<Department> getAllDepartments();
    void viewDepartmentHierarchy(String departmentId);
}