package com.jpworkstyle.bizplan.domain.model;

import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

public class ProjectPlan {

    @Getter
    @Accessors(fluent = true)
    private String name;

    private List<Project> projects = new ArrayList<>();

    @Deprecated
    public  ProjectPlan() {
    }

    public ProjectPlan(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Project project) {
        projects.add(project);
    }
}
