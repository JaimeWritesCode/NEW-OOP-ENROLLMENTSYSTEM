package org.example.model;

import java.util.List;
import java.util.ArrayList;

public class Department {
    private String id;
    private String departmentName;
    private List<Section> sections;

    public Department(String id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
        this.sections = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public List<Section> getSections() {
        return sections;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}