package com.jpworkstyle.bizplan.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public class ProjectPlan {

    @Getter
    @Accessors(fluent = true)
    private String name;

    @Deprecated
    public  ProjectPlan() {
    }

    public ProjectPlan(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
