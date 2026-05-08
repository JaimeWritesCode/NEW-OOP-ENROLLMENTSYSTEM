package org.example.service;
import org.example.model.Department;
import org.example.model.Instructor;

import java.util.ArrayList;
import java.util.List;

public abstract class DepartmentRegistrationService implements DepartmentReg{
    List<Department> departments = new ArrayList<>();
    List<Instructor> instructorList;

    public DepartmentRegistrationService(List<Department> departments){
        this.departments = departments;
    }

    public void showInstructorDepartment(Department department){

    }

    public void saveDepartment(String id, String department, List<Instructor> instructorList){
        departments.add(new Department(id, department, instructorList));
    }

    public List<Department> displayDepartment(){
        return departments.stream().toList();
    }

}