package org.example.service;
import org.example.model.Department;
import org.example.model.Instructor;

import java.util.List;

public interface DepartmentReg {
    List<Department> displayAllDepartment();
    void saveDepartment(Department department);
    void updateCourse(Department department);
    String removeCourse(Department department);
}
