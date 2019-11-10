package com.jpworkstyle.bizplan.domain.model;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.UUID;

@ToString
public class Project {

    @Getter
    @Accessors(fluent = true)
    private String id;

    @Getter
    @Accessors(fluent = true)
    private String name;

    @Getter
    @Accessors(fluent = true)
    private ProjectNumber number;

    public Project(String name, ProjectNumber number) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.number = number;
    }

    @Deprecated
    Project() {
    }
}
