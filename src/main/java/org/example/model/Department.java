package org.example.model;

import java.util.List;

public class Department {
    private String id;
    private String departmentName;
    private List<Instructor> instructorList;

    public Department(String id, String departmentName, List<Instructor> instructorList) {
        this.id = id;
        this.departmentName = departmentName;
        this.instructorList = instructorList;
    }

    // --- GETTERS (The Fix for 'Cannot Find Symbol') ---

    public String getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Instructor> getInstructorList() {
        return instructorList;
    }

    // --- TOSTRING ---

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // Check if list is null or empty to avoid errors
        if (instructorList == null || instructorList.isEmpty()) {
            return String.format("Dept ID: %s | Dept Name: %-15s | No Instructors assigned.%n", id, departmentName);
        }

        for (Instructor i : instructorList) {
            sb.append(String.format("Dept ID: %s | Dept Name: %-15s | Instructor ID: %-10s | Instructor Name: %s%n",
                    id, departmentName, i.getPersonID(), i.getName()));
        }
        return sb.toString();
    }
}