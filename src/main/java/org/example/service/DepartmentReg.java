package org.example.service;

import org.example.model.Department;
import java.util.List;

public interface DepartmentReg {
    void addDepartment(Department department);
    List<Department> getAllDepartments();
    void viewDepartmentHierarchy(String departmentId);
}