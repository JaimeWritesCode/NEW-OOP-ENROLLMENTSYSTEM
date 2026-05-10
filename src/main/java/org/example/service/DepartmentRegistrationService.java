package org.example.service;

import org.example.model.Department;
import org.example.model.Instructor;
import java.util.ArrayList;
import java.util.List;

public abstract class DepartmentRegistrationService implements DepartmentReg {

    protected List<Department> departments;

    public DepartmentRegistrationService() {
        this.departments = new ArrayList<>();
    }


    @Override
    public abstract void viewDepartmentHierarchy(String departmentId);


    public void saveDepartment(String id, String name, List<Instructor> instructors) {
        departments.add(new Department(id, name, instructors));
    }
}