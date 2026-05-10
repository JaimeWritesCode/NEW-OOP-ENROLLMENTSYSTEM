package org.example.model;

import java.util.List;
import java.util.ArrayList;

public class Department {
    private String id;
    private String departmentName;
    private List<Section> sections;
    private List<Instructor> instructors;

    public Department(String id, String departmentName, List<Instructor> instructors) {
        this.id = id;
        this.departmentName = departmentName;
        this.instructors = instructors;
        this.sections = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentId() {
        return id;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void addSection(Section section) {
        this.sections.add(section);
    }
}