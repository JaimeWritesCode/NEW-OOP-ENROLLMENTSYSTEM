package org.example.service;

import org.example.model.Department;
import org.example.model.Section;
import org.example.model.Student;
import java.util.ArrayList;
import java.util.List;

public class DepartmentServiceImpl implements IDepartmentService {
    private List<Department> departments = new ArrayList<>();

    @Override
    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    @Override
    public List<Department> getAllDepartments() {
        return new ArrayList<>(departments);
    }

    @Override
    public void viewDepartmentHierarchy(String departmentId) {

    }
}