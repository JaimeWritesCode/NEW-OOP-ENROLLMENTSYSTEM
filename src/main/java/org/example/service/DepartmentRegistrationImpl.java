package org.example.service;

import org.example.model.Department;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRegistrationImpl implements DepartmentReg {
    // This list stores all the departments you create in Main
    private List<Department> departments = new ArrayList<>();

    @Override
    public List<Department> displayAllDepartment() {
        return departments;
    }

    @Override
    public void saveDepartment(Department department) {
        if (department != null) {
            departments.add(department);
        }
    }

    @Override
    public void updateCourse(Department department) {
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).getId().equals(department.getId())) {
                departments.set(i, department);
                return;
            }
        }
    }

    @Override
    public String removeCourse(Department department) {
        if (departments.remove(department)) {
            return "Department removed successfully.";
        }
        return "Department not found.";
    }
}