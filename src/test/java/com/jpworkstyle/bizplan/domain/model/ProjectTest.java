package com.jpworkstyle.bizplan.domain.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProjectTest {

    private Project project;
    private ProjectNumber number;

    @BeforeEach
    void setUp() {
        number = new ProjectNumber("ABC-123");
        project = new Project("My Project", number);
    }

    @Test
    void projectNameTest() {
        Assertions.assertEquals("My Project", project.name());
    }

    @Test
    void projectIdTest() {
        Assertions.assertEquals(36, project.id().length());
    }

    @Test
    void projectNumberTest() {
        Assertions.assertEquals(number, project.number());
    }
}
