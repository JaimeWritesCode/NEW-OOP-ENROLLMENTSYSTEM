package org.example.service;
import org.example.model.Department;
import java.util.ArrayList;
import java.util.List;

public class DepartmentServiceImpl extends DepartmentRegistrationService {

    public DepartmentServiceImpl() {
        super();
    }

    @Override
    public void addDepartment(Department dept) {
        this.departments.add(dept);
    }

    @Override
    public List<Department> getAllDepartments() {
        return new ArrayList<>(this.departments);
    }

    @Override
    public void viewDepartmentHierarchy(String departmentId) {
        for (Department dept : departments) {
            if (dept.getDepartmentId().equals(departmentId)) {
                System.out.println(" Department: " + dept.getDepartmentName());
                return;
            }
        }
        System.out.println(" Department not found.");
    }
}